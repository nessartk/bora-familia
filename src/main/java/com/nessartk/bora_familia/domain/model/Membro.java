package com.nessartk.bora_familia.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;

    private String papel; // Ex: pai, mãe, filho

    private Integer idade;

    @ManyToOne
    @JoinColumn(name = "familia_id")
    private Familia familia;

    public Membro(UUID id, String nome, String papel, Integer idade){
        this.id = id;
        this.nome = nome;
        this.papel = papel;
        this.idade = idade;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
}

