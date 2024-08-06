package com.carrafasoft.mentoria.lojavirtual.enums.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa{

    @Column(nullable = false)
    private String cnpj;

    private String inscEstadual;

    private String inscMunicipal;

    private String nomeFantasia;

    private String razaoSocial;

    private String categoria;
}