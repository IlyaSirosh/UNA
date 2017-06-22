package una.model;

import java.util.List;

/**
 * Created by Illya on 6/22/17.
 */
public class TemplateDish extends Dish {

    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
