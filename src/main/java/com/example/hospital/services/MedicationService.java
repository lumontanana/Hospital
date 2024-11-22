package com.example.hospital.services;


import com.example.hospital.model.Medication;
import com.example.hospital.repositories.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationService {
    @Autowired
    private MedicationRepository medicationRepository;

    public List<Medication> findByName(String name) {
        return medicationRepository.findMedicationByName(name);
    }

    public List<Medication> findAll() {
        return medicationRepository.findAll();
    }




}
