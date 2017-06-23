package una.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Illya on 6/22/17.
 */
@Entity
public class FactoryDish extends Dish {

    @ManyToOne
    private Manufacturer manufacturer;

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
