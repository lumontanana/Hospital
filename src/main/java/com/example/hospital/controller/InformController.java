package com.example.hospital.controller;

import com.example.hospital.model.Disease;
import com.example.hospital.model.Inform;
import com.example.hospital.services.InformService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class InformController {

    @Autowired
    private InformService informService;

    @GetMapping("/inform")
    public String getAllInform(Model model) {
        List<Inform> inform = informService.findAll();
        model.addAttribute("inform", inform);
        return "inform";
    }
    @GetMapping("/inform/search")
    public String searchInform(@RequestParam Long id, Model model) {
        Inform inform = informService.findById(id);
        model.addAttribute("inform", inform);
        return "inform";
    }
}
