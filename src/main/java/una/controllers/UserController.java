package una.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import una.model.CustomDailyPlan;
import una.model.User;
import una.security.jwt.JwtTokenUtil;
import una.services.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Illya on 6/21/17.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil tokenUtil;

    @ModelAttribute("user")
    public User getUser(HttpServletRequest request){

        String token = request.getHeader(tokenHeader);
        String nickname = tokenUtil.getUsernameFromToken(token);

        return userService.getByNickname(nickname);
    }


    @GetMapping
    public ResponseEntity<?> getUserInfo(@ModelAttribute("user") User user){

        return ResponseEntity.ok(user);

    }

    @GetMapping
    @RequestMapping("/daily/plan/all")
    public ResponseEntity<?> getAllCustomPlans(@ModelAttribute("user") User user){

        return ResponseEntity.ok(userService.getDailyPlanByUserId(user.getId()));
    }

    @GetMapping
    @RequestMapping("/daily/plan/{date}")
    public ResponseEntity<?> getCustomDailyPlanByDate(@ModelAttribute("user") Long user,
                                                    @PathVariable("date")Date date){
        CustomDailyPlan plan = userService.getDailyPlanByUserIdAndDate(user,date);

        if(plan == null)
            return ResponseEntity.badRequest().body(null);

        return ResponseEntity.ok(plan);
    }

    @PostMapping
    @RequestMapping("/daily/plan")
    public ResponseEntity<?> saveDailyPlan(@ModelAttribute("user") User user,@RequestBody CustomDailyPlan plan){

        plan.setUser(user);

        userService.saveDailyPlan(plan);

        return ResponseEntity.ok(null);

    }

}
