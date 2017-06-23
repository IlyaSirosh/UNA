package una.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Illya on 6/23/17.
 */
@Entity
public class TemplateDailyPlan extends DailyPlan {


    @OneToMany
    private List<MeasureType> measureTypes;

    public List<MeasureType> getMeasureTypes() {
        return measureTypes;
    }

    public void setMeasureTypes(List<MeasureType> measureTypes) {
        this.measureTypes = measureTypes;
    }
}
