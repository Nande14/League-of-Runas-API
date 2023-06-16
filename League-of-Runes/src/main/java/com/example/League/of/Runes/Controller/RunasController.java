package com.example.League.of.Runes.Controller;

import com.example.League.of.Runes.model.Runas;
import com.example.League.of.Runes.service.RunasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/runas")
public class RunasController {
    private final RunasService runasService;

    @Autowired
    public RunasController(RunasService runasService) {
        this.runasService = runasService;
    }

    
}