package com.cro.rate_movie.controller;


import com.cro.rate_movie.model.AvaliacaoModel;
import com.cro.rate_movie.model.ComentarioModel;
import com.cro.rate_movie.model.UsuarioModel;
import com.cro.rate_movie.model.enuns.PerfilUsuarioEnum;
import com.cro.rate_movie.repository.ComentarioRepository;
import com.cro.rate_movie.repository.PostarRepository;
import com.cro.rate_movie.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class ComentarioController {

    PostarRepository repository;
    ComentarioRepository comentarioRepository;
    UsuarioRepository usuarioRepository;

    @GetMapping("/avaliacao")
    public List<AvaliacaoModel> getAllPostagens () {
        return repository.findAll();
    }

    @GetMapping("/avaliacao/{id}")
    public AvaliacaoModel getPostById ( @PathVariable Long id ) {
        return repository.getReferenceById(id);
    }

    @PostMapping("/avaliacao")
    public AvaliacaoModel postarComment ( @RequestBody AvaliacaoModel postarModel ) {
        return repository.save(postarModel);

    }

    @GetMapping("/avaliacao/{nomeUsuario}")
    public List<AvaliacaoModel> postarByUser ( @PathVariable String nome ) {
        return repository.findAll();
    }

    @DeleteMapping("/avaliacao/{id}")
    public void deletePostarModel ( @PathVariable Long id ) {
        repository.deleteById(id);
    }

    @DeleteMapping("/comentario/{id}")
    public void deleteComentario ( @PathVariable Long id ) {
        comentarioRepository.deleteById(id);
    }

    @GetMapping("/comentario/{id}")
    public ComentarioModel getComentarioModel ( @PathVariable Long id ) {
        return comentarioRepository.getReferenceById(id);
    }

    @PostMapping("/comentario")
    public ComentarioModel postarComment ( @RequestBody ComentarioModel comentarioModel ) {
        return comentarioRepository.save(comentarioModel);

    }

    @PostMapping("/perfilUsuarioEnum")
    public ComentarioModel perfil ( @RequestBody ComentarioModel comentarioModel ) {
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setPerfil(PerfilUsuarioEnum.LEITOR);
        usuarioModel.getPerfil().equals(PerfilUsuarioEnum.MODERADOR);
        usuarioModel.getPerfil().getNivelBase();
        PerfilUsuarioEnum.MODERADOR.getNivelBase();
        return comentarioRepository.save(comentarioModel);

    }

}

