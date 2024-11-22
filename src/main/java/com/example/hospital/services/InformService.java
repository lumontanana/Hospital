package com.example.hospital.services;

import com.example.hospital.model.Inform;
import com.example.hospital.repositories.InformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformService {
    @Autowired
    private InformRepository informRepository;

    public List<Inform> findByName(String name) {
        return informRepository.findInformByName(name);
    }

    public List<Inform> findAll() {
        return informRepository.findAll();
    }
}
