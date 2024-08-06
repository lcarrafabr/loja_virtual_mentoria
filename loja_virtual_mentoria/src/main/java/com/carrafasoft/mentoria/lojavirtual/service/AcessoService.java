package com.carrafasoft.mentoria.lojavirtual.service;

import com.carrafasoft.mentoria.lojavirtual.enums.model.Acesso;
import com.carrafasoft.mentoria.lojavirtual.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {

    @Autowired
    private AcessoRepository repository;

    public Acesso save(Acesso acesso) {

        return repository.save(acesso);
    }
}
