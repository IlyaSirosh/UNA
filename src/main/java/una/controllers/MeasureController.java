package una.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import una.services.MeasureService;

/**
 * Created by Illya on 6/25/17.
 */
@RestController
@RequestMapping("/measure")
public class MeasureController {

    @Autowired
    private MeasureService measureService;

    @GetMapping
    @RequestMapping("/type/all")
    public ResponseEntity<?> getMeasureTypes(){
        return ResponseEntity.ok(measureService.getAllTypes());
    }

}
