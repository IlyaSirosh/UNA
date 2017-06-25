package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.FactoryDish;

/**
 * Created by Illya on 6/25/17.
 */
public interface FactoryDishRepository extends JpaRepository<FactoryDish,Long> {
}
