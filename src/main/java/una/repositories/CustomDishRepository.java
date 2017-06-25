package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.CustomDish;

import java.util.List;

/**
 * Created by Illya on 6/25/17.
 */
public interface CustomDishRepository extends JpaRepository<CustomDish,Long> {

    List<CustomDish> findByCategory(Long id);
}
