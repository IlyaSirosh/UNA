package una.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Illya on 6/27/17.
 */
@Embeddable
public class CustomDishAmount {

    @ManyToOne
    private CustomDish dish;

    private Double amount;

    public CustomDish getDish() {
        return dish;
    }

    public void setDish(CustomDish dish) {
        this.dish = dish;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
