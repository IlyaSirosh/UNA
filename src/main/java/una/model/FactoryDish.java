package una.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by Illya on 6/22/17.
 */
@Entity
public class FactoryDish extends Dish {

    @ManyToOne
    @JoinColumn
    private Manufacturer manufacturer;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private TemplateDish parent;

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public TemplateDish getParent() {
        return parent;
    }

    public void setParent(TemplateDish parent) {
        this.parent = parent;
    }
}
