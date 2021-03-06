package una.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * Created by Illya on 6/22/17.
 */

@Embeddable
public class Ingredient {

    @ManyToOne
    private Product ingredient;

    @ManyToOne
    private ProductCategory category;

    private Double amount;


    public Product getIngredient() {
        return ingredient;
    }

    public void setIngredient(Product ingredient) {
        this.ingredient = ingredient;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
