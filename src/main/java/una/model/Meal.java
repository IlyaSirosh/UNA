package una.model;



import javax.persistence.*;
import java.util.Date;
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
    @MapKeyClass(value = Product.class)
    @CollectionTable(name = "meal_to_product",joinColumns = @JoinColumn(name = "meal_id"))
    @Column(name = "amount")
    @MapKeyJoinColumn(name = "product_id")
    private Map<Product,Double> products;

    @ElementCollection
    @MapKeyClass(value = CustomDish.class)
    @CollectionTable(name = "meal_to_custom_dish",joinColumns = @JoinColumn(name = "meal_id"))
    @Column(name = "amount")
    @MapKeyJoinColumn(name = "dish_id")
    private Map<CustomDish,Double> customDishes;

    @ElementCollection
    @MapKeyClass(value = TemplateDish.class)
    @CollectionTable(name = "meal_to_template_dish",joinColumns = @JoinColumn(name = "meal_id"))
    @Column(name = "amount")
    @MapKeyJoinColumn(name = "dish_id")
    private Map<TemplateDish,Double> templateDishes;

    @ElementCollection
    @MapKeyClass(value = FactoryDish.class)
    @CollectionTable(name = "meal_to_factory_dish",joinColumns = @JoinColumn(name = "meal_id"))
    @Column(name = "amount")
    @MapKeyJoinColumn(name = "dish_id")
    private Map<FactoryDish,Double> factoryDishes;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
