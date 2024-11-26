package com.example.hospital.controller;

import com.example.hospital.model.Medication;
import com.example.hospital.services.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    @GetMapping("/medications")
    public String getAllMedications(Model model) {
        List<Medication> medications = medicationService.findAll();
        model.addAttribute("medications", medications);
        return "medications";
    }

    public List<Medication> searchMedications(String name) {
        return medicationService.findByName(name);
    }
}
