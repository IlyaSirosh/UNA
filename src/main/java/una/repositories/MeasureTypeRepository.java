package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.MeasureType;

/**
 * Created by Illya on 6/25/17.
 */
public interface MeasureTypeRepository extends JpaRepository<MeasureType,Long> {
}
