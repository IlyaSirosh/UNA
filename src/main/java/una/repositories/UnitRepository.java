package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.Unit;

/**
 * Created by Illya on 6/25/17.
 */
public interface UnitRepository extends JpaRepository<Unit,Long> {
}
