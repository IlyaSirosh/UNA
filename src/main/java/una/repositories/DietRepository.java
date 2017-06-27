package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.Diet;

/**
 * Created by Illya on 6/25/17.
 */
public interface DietRepository extends JpaRepository<Diet,Long> {
}
