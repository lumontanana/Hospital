package com.example.hospital.controller;

import com.example.hospital.model.Patient;
import com.example.hospital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    public List<Patient> getAllPatients() {
        return patientService.findAll();
    }

    public List<Patient> searchPatients(String name) {
        return patientService.findByAddress(name);
    }
}
