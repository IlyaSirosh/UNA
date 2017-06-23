package una.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Illya on 6/22/17.
 */

@Entity
public class TemplateDish extends Dish {

    @ElementCollection
    @CollectionTable(name = "template_dish_ingredient",joinColumns=@JoinColumn(name = "dish_id"))
    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
