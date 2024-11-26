package com.example.hospital.controller;

import com.example.hospital.model.Disease;
import com.example.hospital.model.Medication;
import com.example.hospital.services.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DiseaseController {

    @Autowired
    private DiseaseService diseaseService;

    @GetMapping("/diseases")
    public String getAllDiseases(Model model) {
        List<Disease> medications = diseaseService.findAll();
        model.addAttribute("diseases", medications);
        return "medications";
    }

    public List<Disease> gerDiseaseByName(String name) {
        return diseaseService.findByName(name);
    }
}
