package com.example.hospital.controller;

import com.example.hospital.model.Disease;
import com.example.hospital.services.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DiseaseController {

    @Autowired
    private DiseaseService diseaseService;


    public List<Disease> getAllDiseases() {
        return diseaseService.findAll();
    }

    public List<Disease> gerDiseaseByName(String name) {
        return diseaseService.findByName(name);
    }
}
