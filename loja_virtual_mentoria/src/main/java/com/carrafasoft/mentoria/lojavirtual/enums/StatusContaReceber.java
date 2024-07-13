package com.carrafasoft.mentoria.lojavirtual.enums;

public enum StatusContaReceber {

    COBRANÇA("PAGAR"),
    VENCIDA("VENCIDA"),
    ABERTA("ABERTA"),
    QUITADA("QUITADA");

    private String descricao;

    StatusContaReceber(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
