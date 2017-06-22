package una.model;

/**
 * Created by Illya on 6/22/17.
 */
public class Nutrients {

    private Double carbohydrates;
    private Double fats;
    private Double proteins;
    private Double calories;

    public Nutrients(){}

    public Nutrients(Double carbohydrates, Double fats, Double proteins, Double calories) {
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.proteins = proteins;
        this.calories = calories;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Double getFats() {
        return fats;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public Double getProteins() {
        return proteins;
    }

    public void setProteins(Double proteins) {
        this.proteins = proteins;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }
}
