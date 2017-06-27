package una.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * Created by Illya on 6/27/17.
 */
@Embeddable
public class ProductAmount {


    @ManyToOne
    private Product product;

    private Double amount;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
