package una.model;

/**
 * Created by Illya on 6/22/17.
 */
public class FactoryDish extends Dish {

    private Manufacturer manufacturer;

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
