package com.carrafasoft.mentoria.lojavirtual.enums.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "acesso")
public class Acesso implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String descricao;/*Acesso ex: ROLE_ADMIN ou ROLE_SECRETARIO */

    @Override
    public String getAuthority() {
        return this.descricao;
    }
}
