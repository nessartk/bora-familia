package com.nessartk.bora_familia.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Familia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nomeFamilia;

    private LocalDateTime dataCriacao;



    public Familia(UUID id, String nomeFamilia){
        this.id = id;
        this.nomeFamilia = nomeFamilia;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeFamilia() {
        return nomeFamilia;
    }

    public void setNome(String nomeFamilia) {
        this.nomeFamilia = nomeFamilia;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String informacoeFamilia(){
        return "Família" +getNomeFamilia() + "Data de criação" + getDataCriacao() + "Identificador" + getId();
    }









}

