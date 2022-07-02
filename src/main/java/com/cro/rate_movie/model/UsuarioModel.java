package com.cro.rate_movie.model;

import com.cro.rate_movie.model.enuns.PerfilUsuarioEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String apelido;
    @Column(unique = true)
    private String login;
    @CPF
    private String cpf;
    @Email
    private String email;
    @Column(unique = true)
    private PerfilUsuarioEnum perfil;
}
