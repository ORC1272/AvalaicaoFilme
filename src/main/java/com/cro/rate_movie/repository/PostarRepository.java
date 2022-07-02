package com.cro.rate_movie.repository;

import com.cro.rate_movie.model.AvaliacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostarRepository extends JpaRepository <AvaliacaoModel,Long>{
}
