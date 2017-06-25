package una.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import una.model.DishCategory;
import una.model.ProductCategory;
import una.model.TemplateDish;
import una.services.FoodService;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by Illya on 6/25/17.
 */
@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    @RequestMapping("/dish/category/all")
    public ResponseEntity<?> getAllDishCategories(){
        return ResponseEntity.ok(foodService.getAllDishCategories());
    }

    @GetMapping
    @RequestMapping("/product/category/main")
    public ResponseEntity<?> getMainProductCategories(){
        return ResponseEntity.ok(foodService.getMainProductCategories());
    }

    @GetMapping
    @RequestMapping("/product/category/of/parent/{id}")
    public ResponseEntity<?> getProductCategoriesOfParent(@PathVariable("id")Long id){
        return ResponseEntity.ok(foodService.getProductCategoriesByParent(id));
    }

    @GetMapping
    @RequestMapping("/product/of/{id}/category/all")
    public ResponseEntity<?> getAllProductsOfCategory(@PathVariable("id")Long id){
        return ResponseEntity.ok(foodService.getProductByCategory(id));
    }

    @GetMapping
    @RequestMapping("/dish/of/{id}/category/all")
    public ResponseEntity<?> getAllDishesOfCategory(@PathVariable("id")Long id){

        Map<String, Object> map = new HashMap<>();

        map.put("template",foodService.getTemplateDishByCategory(id));
        map.put("custom",foodService.getCustomDishesByCategory(id));

        return ResponseEntity.ok(map);
    }

    @GetMapping
    @RequestMapping("/factory/dish/of/{id}/template/dish/all")
    public ResponseEntity<?> getAllFactoryDishesByTemplateDish(@PathVariable("id")Long id){
        return ResponseEntity.ok(foodService.getFactoryDishesByTemplateDish(id));
    }






}
