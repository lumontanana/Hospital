package com.example.hospital.services;

import com.example.hospital.model.Disease;
import com.example.hospital.repositories.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseService {
    @Autowired
    DiseaseRepository diseaseRepository;

    public List<Disease> findByName(String name) {
        return diseaseRepository.findDiseaseByName(name);
    }

    public List<Disease> findAll() {
        return diseaseRepository.findAll();
    }
}
