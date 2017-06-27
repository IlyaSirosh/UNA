package una.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import una.model.CustomDailyPlan;
import una.model.DailyPlan;
import una.model.Meal;
import una.model.User;
import una.repositories.CustomDailyPlanRepository;
import una.repositories.MealRepository;
import una.repositories.UserRepository;
import una.services.UserService;

import java.util.Date;
import java.util.List;

/**
 * Created by Illya on 6/25/17.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private CustomDailyPlanRepository customDailyPlanRepository;

    @Override
    public User getById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getByNickname(String nickname) {
        return userRepository.findByNickname(nickname);
    }

    @Override
    public List<CustomDailyPlan> getDailyPlanByUserId(Long user) {
        return customDailyPlanRepository.findByUser_idOrderByDateDesc(user);
    }

    @Override
    public CustomDailyPlan getDailyPlanByUserIdAndDate(Long user, Date date) {
        return customDailyPlanRepository.findByUser_idAndDate(user, date);
    }

    @Override
    public CustomDailyPlan saveDailyPlan(CustomDailyPlan plan) {
        return customDailyPlanRepository.save(plan);
    }

    @Override
    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }
}
