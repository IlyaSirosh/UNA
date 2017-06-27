package una.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * Created by Illya on 6/27/17.
 */

@Embeddable
public class FactoryDishAmount {

    @ManyToOne
    private FactoryDish dish;

    private Double amount;

    public FactoryDish getDish() {
        return dish;
    }

    public void setDish(FactoryDish dish) {
        this.dish = dish;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
