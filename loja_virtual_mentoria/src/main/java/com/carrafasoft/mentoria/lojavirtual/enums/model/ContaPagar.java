package com.carrafasoft.mentoria.lojavirtual.enums.model;

import com.carrafasoft.mentoria.lojavirtual.enums.StatusContaPagar;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "conta_pagar")
@SequenceGenerator(name = "seq_conta_pagar", sequenceName = "seq_conta_pagar", allocationSize = 1)
public class ContaPagar {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_pagar")
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusContaPagar status;

    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;

    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Temporal(TemporalType.DATE)
    private Date dtPagamento;


    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_forn_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_forn_id"))
    private Pessoa pessoa_fornecedor;


}
