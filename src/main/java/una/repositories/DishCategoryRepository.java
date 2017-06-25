package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.DishCategory;

/**
 * Created by Illya on 6/25/17.
 */
public interface DishCategoryRepository extends JpaRepository<DishCategory,Long> {
}
