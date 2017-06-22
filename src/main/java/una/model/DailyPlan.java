package una.model;

import java.sql.Date;
import java.util.List;

/**
 * Created by Illya on 6/22/17.
 */
public class DailyPlan {

    private Long id;
    private List<Meal> meals;
    private List<Measure> measures;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }
}
