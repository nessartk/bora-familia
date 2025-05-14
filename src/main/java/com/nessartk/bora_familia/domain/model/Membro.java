package com.nessartk.bora_familia.domain.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nomeMembro;

    private String papel; // Ex: pai, mãe, filho

    private Integer idade;

    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL)
    private List<Membro> membros = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "familia_id")
    private Familia familia;

    public Membro(UUID id, String nomeMembro, String papel, Integer idade){
        this.id = id;
        this.nomeMembro = nomeMembro;
        this.papel = papel;
        this.idade = idade;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeMembro() {
        return nomeMembro;
    }

    public void setNome(String nomeMembro) {
        this.nomeMembro = nomeMembro;
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

    public List<Membro> getMembros() {
        return membros;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    public int getQuantidadeMembros(){
        return membros.size();
    }

    public void adicionarMembro(){
        membros.add((Membro) membros);// list
    }

    public void removerMembro(){
        membros.remove((Membro) membros); // list
    }

    public String getInformacoesMembro(){
        return "Membro"+ getNomeMembro() + "papel"+ getPapel();
    }




}

