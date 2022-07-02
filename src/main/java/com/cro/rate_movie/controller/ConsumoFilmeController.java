package com.cro.rate_movie.controller;

import com.cro.rate_movie.model.ConsumidorFilme;
import com.cro.rate_movie.dto.FilmeDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/avaliacao")
@AllArgsConstructor
public class ConsumoFilmeController {
    ConsumidorFilme consumidorFilme;
    @GetMapping("/filme/{titulo-filme}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<FilmeDto> getCharacterById( @PathVariable(name = "titulo-filme") String t) {
        return consumidorFilme.buscaPorFilme(t);
    }

}



