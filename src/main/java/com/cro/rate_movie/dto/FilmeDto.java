package com.cro.rate_movie.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Filmes")
@JsonIgnoreProperties(ignoreUnknown=true)
//@Builder
public class FilmeDto implements Serializable {

    @Id
    @JsonProperty("imdbID")
    private String imdbID;

    @JsonProperty("Title")
    private String Title;

    @JsonProperty("Year")
    private String Year;

    @JsonProperty("Rated")
    private String Rated;

    @JsonProperty("Runtime")
    private String Runtime;

    @JsonProperty("Genre")
    private String Genre;

    @JsonProperty("Director")
    private String Director;

    @JsonProperty("Writer")
    private String Writer;

    @JsonProperty("Actor")
    private String Actor;

    @JsonProperty("Plot")
    private String Plot;

    @JsonProperty("Language")
    private String Language;

    @JsonProperty("Country")
    private String Country;

    @JsonProperty("Awards")
    private String Awards;

/*
    @Override
    public String toString () {
        return "RetornoConsumidorFilme{" +
                "imdbID='" + imdbID + '\'' +
                ", Title='" + Title + '\'' +
                ", Year='" + Year + '\'' +
                ", Rated='" + Rated + '\'' +
                ", Runtime='" + Runtime + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Director='" + Director + '\'' +
                ", Writer='" + Writer + '\'' +
                ", Actor='" + Actor + '\'' +
                ", Plot='" + Plot + '\'' +
                ", Language='" + Language + '\'' +
                ", Country='" + Country + '\'' +
                ", Awards='" + Awards + '\'' +
                '}';

 */
    }
