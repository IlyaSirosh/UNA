package una.model;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Illya on 6/22/17.
 */


@Entity
public class TemplateWeeklyPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ElementCollection(targetClass = TemplateWeeklyPlan.class)
    @MapKeyClass(value = Integer.class)
    @CollectionTable(name = "weekly_plan_to_day_plan",joinColumns = @JoinColumn(name = "weekly_plan_id"))
    @MapKeyColumn(name = "day_number")
    private Map<Integer,TemplateDailyPlan> dailyPlans;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Integer, TemplateDailyPlan> getDailyPlans() {
        return dailyPlans;
    }

    public void setDailyPlans(Map<Integer, TemplateDailyPlan> dailyPlans) {
        this.dailyPlans = dailyPlans;
    }
}
