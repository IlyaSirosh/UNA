package una.model;

/**
 * Created by Illya on 6/22/17.
 */
public class MeasureType {

    private Long id;
    private String name;
    private Unit recommendedUnit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getRecommendedUnit() {
        return recommendedUnit;
    }

    public void setRecommendedUnit(Unit recommendedUnit) {
        this.recommendedUnit = recommendedUnit;
    }
}
