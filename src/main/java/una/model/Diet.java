package una.model;

import javax.persistence.*;

/**
 * Created by Illya on 6/22/17.
 */
@Entity
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30)
    private String name;

    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    private TemplateDailyPlan dailyPlan;

    @OneToOne(cascade = CascadeType.ALL)
    private TemplateWeeklyPlan weeklyPlan;

    private Integer duration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateDailyPlan getDailyPlan() {
        return dailyPlan;
    }

    public void setDailyPlan(TemplateDailyPlan dailyPlan) {
        this.dailyPlan = dailyPlan;
    }

    public TemplateWeeklyPlan getWeeklyPlan() {
        return weeklyPlan;
    }

    public void setWeeklyPlan(TemplateWeeklyPlan weeklyPlan) {
        this.weeklyPlan = weeklyPlan;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
