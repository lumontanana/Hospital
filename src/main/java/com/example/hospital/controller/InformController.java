package com.example.hospital.controller;

import com.example.hospital.model.Inform;
import com.example.hospital.services.InformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class InformController {

    @Autowired
    private InformService informService;

    public List<Inform> getAllInform() {
        return informService.findAll();
    }

    public List<Inform> searchInform(String name) {
        return informService.findByName(name);
    }
}
