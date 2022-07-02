package com.cro.rate_movie.repository;

import com.cro.rate_movie.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {

}
