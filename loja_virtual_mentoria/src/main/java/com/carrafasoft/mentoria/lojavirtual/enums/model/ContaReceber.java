package com.carrafasoft.mentoria.lojavirtual.enums.model;

import com.carrafasoft.mentoria.lojavirtual.enums.StatusContaReceber;
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
@Table(name = "conta_receber")
@SequenceGenerator(name = "seq_conta_receber", sequenceName = "seq_conta_receber", allocationSize = 1)
public class ContaReceber implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_receber")
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusContaReceber status;

    @Temporal(TemporalType.DATE)
    private Date dtvencimento;

    @Temporal(TemporalType.DATE)
    private Date dtPagamento;

    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;

}
