package una.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * Created by Illya on 6/27/17.
 */
@Embeddable
public class TemplateDishAmount {


    @ManyToOne
    private TemplateDish dish;

    private Double amount;

    public TemplateDish getDish() {
        return dish;
    }

    public void setDish(TemplateDish dish) {
        this.dish = dish;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
