package una.model;

import java.sql.Date;
import java.util.List;

/**
 * Created by Illya on 6/22/17.
 */
public class CustomDailyPlan extends DailyPlan {

    private User user;
    private Date date;


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
}
