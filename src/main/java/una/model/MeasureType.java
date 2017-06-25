package una.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Illya on 6/22/17.
 */
@Entity
public class MeasureType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30)
    private String name;

    @OneToOne
    @JoinColumn(name = "recommended_unit_id")
    private Unit recommendedUnit;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "measureType")
    private List<Unit> units;

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

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }
}
