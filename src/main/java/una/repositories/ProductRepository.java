package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.Product;

import java.util.List;

/**
 * Created by Illya on 6/25/17.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {

//    List<Product> findByCategory();

}
