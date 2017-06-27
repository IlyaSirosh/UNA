package una.model;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Illya on 6/22/17.
 */
@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30)
    private String name;

    @Embedded
    private Nutrients recommendedNutrients;

    @ElementCollection
    @CollectionTable(name = "meal_to_product",joinColumns = @JoinColumn(name = "meal_id"))
    private List<ProductAmount> products;

    @ElementCollection
    @CollectionTable(name = "meal_to_custom_dish",joinColumns = @JoinColumn(name = "meal_id"))
    private List<CustomDishAmount> customDishes;

    @ElementCollection
    @CollectionTable(name = "meal_to_template_dish",joinColumns = @JoinColumn(name = "meal_id"))
    private List<TemplateDishAmount> templateDishes;

    @ElementCollection
    @CollectionTable(name = "meal_to_factory_dish",joinColumns = @JoinColumn(name = "meal_id"))
    private List<FactoryDishAmount> factoryDishes;

    @Temporal(TemporalType.TIME)
    private Date time;

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

    public List<ProductAmount> getProducts() {
        return products;
    }

    public void setProducts(List<ProductAmount> products) {
        this.products = products;
    }

    public List<CustomDishAmount> getCustomDishes() {
        return customDishes;
    }

    public void setCustomDishes(List<CustomDishAmount> customDishes) {
        this.customDishes = customDishes;
    }

    public List<TemplateDishAmount> getTemplateDishes() {
        return templateDishes;
    }

    public void setTemplateDishes(List<TemplateDishAmount> templateDishes) {
        this.templateDishes = templateDishes;
    }

    public List<FactoryDishAmount> getFactoryDishes() {
        return factoryDishes;
    }

    public void setFactoryDishes(List<FactoryDishAmount> factoryDishes) {
        this.factoryDishes = factoryDishes;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
