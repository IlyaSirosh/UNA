package una.model;

import java.sql.Time;
import java.util.Map;

/**
 * Created by Illya on 6/22/17.
 */
public class Meal {


    private Long id;
    private String name;
    private Nutrients recommendedNutrients;
    private Map<Product,Double> products;
    private Map<CustomDish,Double> customDishes;
    private Map<TemplateDish,Double> templateDishes;
    private Map<FactoryDish,Double> factoryDishes;
    private Time time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nutrients getRecommendedNutrients() {
        return recommendedNutrients;
    }

    public void setRecommendedNutrients(Nutrients recommendedNutrients) {
        this.recommendedNutrients = recommendedNutrients;
    }

    public Map<Product, Double> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Double> products) {
        this.products = products;
    }

    public Map<CustomDish, Double> getCustomDishes() {
        return customDishes;
    }

    public void setCustomDishes(Map<CustomDish, Double> customDishes) {
        this.customDishes = customDishes;
    }

    public Map<TemplateDish, Double> getTemplateDishes() {
        return templateDishes;
    }

    public void setTemplateDishes(Map<TemplateDish, Double> templateDishes) {
        this.templateDishes = templateDishes;
    }

    public Map<FactoryDish, Double> getFactoryDishes() {
        return factoryDishes;
    }

    public void setFactoryDishes(Map<FactoryDish, Double> factoryDishes) {
        this.factoryDishes = factoryDishes;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
