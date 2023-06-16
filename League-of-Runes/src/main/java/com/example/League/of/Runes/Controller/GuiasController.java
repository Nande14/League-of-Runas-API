package com.example.League.of.Runes.Controller;

import com.example.League.of.Runes.model.Guias;
import com.example.League.of.Runes.service.GuiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guias")
public class GuiasController {
    private final GuiasService guiasService;

    @Autowired
    public GuiasController(GuiasService guiasService) {
        this.guiasService = guiasService;
    }

    
}