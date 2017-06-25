package una.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import una.model.ProductCategory;

import java.util.List;

/**
 * Created by Illya on 6/25/17.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {


    List<ProductCategory> findByParentIsNull();
    List<ProductCategory> findByParent(Long parent);
}
