package una.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Illya on 6/22/17.
 */

@Entity
public class CustomDailyPlan extends DailyPlan {

    @OneToOne
    private User user;

    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany
    private List<Measure> measures;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }
}
