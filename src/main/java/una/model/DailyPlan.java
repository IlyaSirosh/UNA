package una.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Illya on 6/22/17.
 */

@MappedSuperclass
public abstract class DailyPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @OneToMany(cascade = CascadeType.ALL)
    protected List<Meal> meals;


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

}
