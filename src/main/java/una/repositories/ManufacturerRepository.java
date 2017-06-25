package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.Manufacturer;

/**
 * Created by Illya on 6/25/17.
 */
public interface ManufacturerRepository extends JpaRepository<Manufacturer,Long> {
}
