package com.carrafasoft.mentoria.lojavirtual.enums.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1)
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    private Long id;

    private String tipoUnidade; //Isso pra mim deveria ser uma outra tabela.

    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private Boolean ativo = Boolean.TRUE;

    /** colocar itemn nota produto = associar **/

    private Double peso; // 1000.55 G

    private Double largura;

    private Double altura;

    private Double profundidade;

    private BigDecimal valorVenda = BigDecimal.ZERO;

    private Integer qtdEstoque = 0;

    private Integer qtdAlertaEstoque = 0;

    private String linkYoutube;

    private Boolean alertaQtdEstoque = Boolean.FALSE;

    private Long qtdClique = 0L;
}
