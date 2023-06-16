package com.example.League.of.Runes.Controller;

import com.example.League.of.Runes.model.Balanceamento;
import com.example.League.of.Runes.service.BalanceamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/balanceamento")
public class BalanceamentoController {
    private final BalanceamentoService BalanceamentoService;

    @Autowired
    public BalanceamentoController(BalanceamentoService BalanceamentoService) {
        this.BalanceamentoService = BalanceamentoService;
    }

    
}