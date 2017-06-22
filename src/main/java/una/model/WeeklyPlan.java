package una.model;

import java.util.Map;

/**
 * Created by Illya on 6/22/17.
 */
public class WeeklyPlan {

    private Long id;
    private Map<Integer,DailyPlan> dailyPlans;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Integer, DailyPlan> getDailyPlans() {
        return dailyPlans;
    }

    public void setDailyPlans(Map<Integer, DailyPlan> dailyPlans) {
        this.dailyPlans = dailyPlans;
    }
}
