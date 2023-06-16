package com.example.League.of.Runes.Controller;

import com.example.League.of.Runes.model.Campeoes;
import com.example.League.of.Runes.service.CampeoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campeoes")
public class CampeoesController {
    private final CampeoesService campeoesService;

    @Autowired
    public CampeoesController(CampeoesService campeoesService) {
        this.campeoesService = campeoesService;
    }

    
}
