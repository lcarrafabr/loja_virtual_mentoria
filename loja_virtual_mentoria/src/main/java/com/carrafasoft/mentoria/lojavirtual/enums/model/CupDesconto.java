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
@Table(name = "cup_desconto")
@SequenceGenerator(name = "seq_cup_desconto", sequenceName = "seq_cup_desconto", allocationSize = 1)
public class CupDesconto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cup_desconto")
    private Long Id;

    private String codDesc;

    private BigDecimal valorRealDesc;

    private BigDecimal valorPorcentDesc;

    @Temporal(TemporalType.DATE)
    private Date dataValidadeCupom;

}
