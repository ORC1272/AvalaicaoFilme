package com.cro.rate_movie.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class ComentarioModel {

    @Id
    @GeneratedValue
    private Long id;
    private String imdbID;
    private Integer nota;
    private String texto;

    @ManyToOne
    private AvaliacaoModel postarModel;

    @ManyToOne
    private UsuarioModel comentarista;

    public ComentarioModel () {
    }

    public ComentarioModel ( String texto, AvaliacaoModel postarModel, UsuarioModel comentarista) {
        this.texto = texto;
        this.postarModel = postarModel;
        this.comentarista = comentarista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getTexto () {
        return texto;
    }

    public void setTexto ( String texto ) {
        this.texto = texto;
    }

    public AvaliacaoModel getPostarModel () {
        return postarModel;
    }

    public void setPostarModel ( AvaliacaoModel postarModel ) {
        this.postarModel = postarModel;
    }

    public UsuarioModel getComentarista () {
        return comentarista;
    }

    public void setComentarista ( UsuarioModel comentarista ) {
        this.comentarista = comentarista;
    }
}
