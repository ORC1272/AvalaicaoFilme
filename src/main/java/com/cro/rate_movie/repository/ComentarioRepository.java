package com.cro.rate_movie.repository;

import com.cro.rate_movie.model.ComentarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<ComentarioModel, Long> {

}
