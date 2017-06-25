package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.CustomDailyPlan;
import una.model.User;

import java.util.Date;
import java.util.List;

/**
 * Created by Illya on 6/25/17.
 */
public interface CustomDailyPlanRepository extends JpaRepository<CustomDailyPlan,Long> {


    CustomDailyPlan findByUserAndDate(Long user_id, Date date);
    List<CustomDailyPlan> findByUserOrderByDateDesc(Long user_id);

}
