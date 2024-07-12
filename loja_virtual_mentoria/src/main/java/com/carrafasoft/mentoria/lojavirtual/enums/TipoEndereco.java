package com.carrafasoft.mentoria.lojavirtual.enums;

public enum TipoEndereco {

    COBRANCA("COBRANÇA"),
    ENTREGA("ENTREGA");

    private String descricao;

    TipoEndereco(String descricao) {
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
