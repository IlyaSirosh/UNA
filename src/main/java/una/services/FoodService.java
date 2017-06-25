package una.services;

import una.model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Illya on 6/25/17.
 */
public interface FoodService {

    List<DishCategory> getAllDishCategories();
    List<ProductCategory> getMainProductCategories();
    List<ProductCategory> getProductCategoriesByParent(Long category);

    List<Product> getProductByCategory(Long category);
    List<CustomDish> getCustomDishesByCategory(Long category);
    List<TemplateDish> getTemplateDishByCategory(Long category);

    List<FactoryDish> getFactoryDishesByTemplateDish(Long templateDish);


}
