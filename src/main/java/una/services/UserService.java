package una.services;


import una.model.CustomDailyPlan;
import una.model.User;

import java.util.Date;
import java.util.List;

/**
 * Created by Illya on 6/25/17.
 */


public interface UserService {


    User getById(Long id);
    User getByNickname(String nickname);

    List<CustomDailyPlan> getDailyPlanByUserId(Long user);
    CustomDailyPlan getDailyPlanByUserIdAndDate(Long user, Date date);
    void saveDailyPlan(CustomDailyPlan plan);



}
