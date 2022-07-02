package com.cro.rate_movie.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
public class AvaliacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String imdbID;
    private Integer nota;
    private Date dataCriacao;

    @ManyToOne
    private UsuarioModel avaliador;



    public AvaliacaoModel () {
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitulo () {
//        return titulo;
//    }
//
//    public void setTitulo ( String titulo ) {
//        this.titulo = titulo;
//    }
//
//    public String getNota () {
//        return nota;
//    }
//
//    public void setNota ( String nota ) {
//        this.nota = nota;
//    }
//
//    public Date getDataCriacao () {
//        return dataCriacao;
//    }
//
//    public void setDataCriacao ( Date dataCriacao ) {
//        this.dataCriacao = dataCriacao;
//    }
//
//    public UsuarioModel getAvaliador () {
//        return avaliador;
//    }
//
//    public void setAvaliador ( UsuarioModel avaliador ) {
//        this.avaliador = avaliador;
//    }

}
