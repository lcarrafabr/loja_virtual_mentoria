package com.carrafasoft.mentoria.lojavirtual.controller;

import com.carrafasoft.mentoria.lojavirtual.enums.model.Acesso;
import com.carrafasoft.mentoria.lojavirtual.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AcessoController {

    @Autowired
    private AcessoService service;

    @PostMapping()
    public Acesso salvarAcesso(Acesso acesso) {

        return service.save(acesso);
    }
}
