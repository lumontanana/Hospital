package com.example.hospital.services;

import com.example.hospital.model.Patient;
import com.example.hospital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> findByAddress(String address) {
        return patientRepository.findPatientByAddress(address);
    }

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    public List<Patient> findByName(String name) {
        return patientRepository.findByName(name);
    }
}
