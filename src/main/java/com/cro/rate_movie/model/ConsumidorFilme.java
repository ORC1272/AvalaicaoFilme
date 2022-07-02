package com.cro.rate_movie.model;


import com.cro.rate_movie.dto.FilmeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class ConsumidorFilme {
    private final WebClient webClient;
    public ConsumidorFilme(WebClient.Builder builder) {
        webClient = builder.baseUrl("http://www.omdbapi.com/").build();

    }

    public Mono<FilmeDto> buscaPorFilme ( String t) {
        log.info("Buscando filme por nome [{}]", t);
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder.path("").queryParam("apikey","9aa4b3aa").queryParam("t", t).build())
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError,
                        error -> Mono.error(new RuntimeException("verifique os parâmetros informados")))
                .bodyToMono(FilmeDto.class);
    }


}

