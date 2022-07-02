package com.cro.rate_movie.model.enuns;


import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum PerfilUsuarioEnum {
    LEITOR(0),
    BASICO(20),
    AVANCADO(100),
    MODERADOR(1000);
    private Integer nivelBase;

}
