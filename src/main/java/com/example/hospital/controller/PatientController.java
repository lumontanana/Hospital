package com.example.hospital.controller;

import com.example.hospital.model.Medication;
import com.example.hospital.model.Patient;
import com.example.hospital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public String getAllPatients(Model model) {
        List<Patient> patients = patientService.findAll();
        model.addAttribute("patients", patients);
        return "patients";
    }

    @GetMapping("/patients/search")
    public String searchPatients(Model model, String name) {
        List<Patient> patients = patientService.findByName(name);
        model.addAttribute("patients", patients);
        return "patients";
    }
}

