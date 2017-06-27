package una.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by Illya on 6/22/17.
 */
@Entity
public class CustomDish extends Dish{



    @ElementCollection
    @CollectionTable(name = "custom_dish_ingredient", joinColumns=@JoinColumn(name = "dish_id"))
    private List<Ingredient> ingredients;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
