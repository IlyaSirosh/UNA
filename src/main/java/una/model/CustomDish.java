package una.model;

import java.util.List;
import java.util.Map;

/**
 * Created by Illya on 6/22/17.
 */
public class CustomDish extends Dish{

    private List<Ingredient> ingredients;
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
