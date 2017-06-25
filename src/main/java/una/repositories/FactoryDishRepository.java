package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.FactoryDish;

import java.util.List;

/**
 * Created by Illya on 6/25/17.
 */
public interface FactoryDishRepository extends JpaRepository<FactoryDish,Long> {

    List<FactoryDish> findByCategory(Long id);
    List<FactoryDish> findByParent(Long id);
}
