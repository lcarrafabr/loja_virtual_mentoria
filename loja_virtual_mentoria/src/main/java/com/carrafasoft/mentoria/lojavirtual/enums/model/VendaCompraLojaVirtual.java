package com.carrafasoft.mentoria.lojavirtual.enums.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "vd_cp_loja_virt")
@SequenceGenerator(name = "seq_vd_cp_loja_virt", sequenceName = "seq_vd_cp_loja_virt", allocationSize = 1)
public class VendaCompraLojaVirtual implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_vd_cp_loja_virt")
    private Long id;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "endereco_entrega_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_entrega_fk"))
    private Endereco enderecoEntrega;

    @ManyToOne
    @JoinColumn(name = "endereco_cobranca_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_cobranca_fk"))
    private Endereco enderecoCobranca;

    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;

    @ManyToOne
    @JoinColumn(name = "forma_pagamento_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "forma_pagamento_fk"))
    private FormaPagamento formaPagamento;

    @OneToOne
    @JoinColumn(name = "nota_fiscal_venda_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_venda_fk"))
    private NotaFiscalVenda notaFiscalVenda;

    @ManyToOne
    @JoinColumn(name = "cupom_desconto_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "cupom_desconto_fk"))
    private CupDesconto cupDesconto;

    private BigDecimal valorFrete;

    private Integer diasEntrega;

    @Temporal(TemporalType.DATE)
    private Date dataVenda;

    @Temporal(TemporalType.DATE)
    private Date dataEntrega;
}
