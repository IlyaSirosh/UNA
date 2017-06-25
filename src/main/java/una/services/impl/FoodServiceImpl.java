package una.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import una.model.*;
import una.repositories.*;
import una.services.FoodService;

import java.util.List;

/**
 * Created by Illya on 6/25/17.
 */
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private DishCategoryRepository dishCategoryRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private TemplateDishRepository templateDishRepository;

    @Autowired
    private FactoryDishRepository factoryDishRepository;

    @Autowired
    private CustomDishRepository customDishRepository;

    @Autowired
    private  ProductRepository productRepository;

    @Override
    public List<DishCategory> getAllDishCategories() {
        return dishCategoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> getMainProductCategories() {
        return productCategoryRepository.findByParentIsNull();
    }

    @Override
    public List<ProductCategory> getProductCategoriesByParent(Long category) {
        return productCategoryRepository.findByParent(category);
    }

    @Override
    public List<Product> getProductByCategory(Long category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<CustomDish> getCustomDishesByCategory(Long category) {
        return customDishRepository.findByCategory(category);
    }

    @Override
    public List<TemplateDish> getTemplateDishByCategory(Long category) {
        return templateDishRepository.findByCategory(category);
    }

    @Override
    public List<FactoryDish> getFactoryDishesByTemplateDish(Long templateDish) {
        return factoryDishRepository.findByParent(templateDish);
    }
}
