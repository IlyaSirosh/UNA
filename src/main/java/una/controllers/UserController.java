package una.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import una.model.User;
import una.repositories.UserRepository;
import una.security.jwt.JwtTokenUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Illya on 6/21/17.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil tokenUtil;

    @ModelAttribute("user")
    public User getUser(HttpServletRequest request){

        String token = request.getHeader(tokenHeader);
        String nickname = tokenUtil.getUsernameFromToken(token);

        return userRepository.findByNickname(nickname);
    }


    @GetMapping
    public ResponseEntity<?> getUserInfo(@ModelAttribute("user") User user){

        return ResponseEntity.ok(user);

    }

}
