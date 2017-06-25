package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.TemplateDish;

/**
 * Created by Illya on 6/25/17.
 */
public interface TemplateDishRepository extends JpaRepository<TemplateDish, Long> {
}
