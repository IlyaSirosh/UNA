package una.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import una.model.MeasureType;
import una.repositories.MeasureTypeRepository;
import una.services.MeasureService;

import java.util.List;

/**
 * Created by Illya on 6/25/17.
 */
@Service
public class MeasureServiceImpl implements MeasureService {

    @Autowired
    private MeasureTypeRepository typeRepository;

    @Override
    public List<MeasureType> getAllTypes() {
        return typeRepository.findAll();
    }
}
