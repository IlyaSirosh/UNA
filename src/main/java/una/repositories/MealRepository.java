package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.Meal;

/**
 * Created by Illya on 6/27/17.
 */
public interface MealRepository extends JpaRepository<Meal,Long> {
}
