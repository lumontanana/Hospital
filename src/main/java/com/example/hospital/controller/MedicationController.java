package com.example.hospital.controller;

import com.example.hospital.model.Medication;
import com.example.hospital.services.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    public List<Medication> getAllMedications() {
        return medicationService.findAll();
    }

    public List<Medication> searchMedications(String name) {
        return medicationService.findByName(name);
    }
}
