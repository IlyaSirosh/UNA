package una.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import una.model.User;
import una.repositories.UserRepository;

/**
 * Created by Illya on 6/21/17.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    @RequestMapping("/by/email/{email}")
    public User getUserByEmail(@PathVariable("email")String email){

        return userRepository.findByEmail(email);
    }

}
