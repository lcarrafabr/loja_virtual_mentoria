package com.carrafasoft.mentoria.lojavirtual.enums;

public enum StatusContaPagar {

    COBRANÇA("PAGAR"),
    VENCIDA("VENCIDA"),
    ABERTA("ABERTA"),
    QUITADA("QUITADA"),
    NEGOCIADA("RENEGOCIADA");

    private String descricao;

    StatusContaPagar(String descricao) {
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
