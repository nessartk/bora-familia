package com.nessartk.bora_familia.domain.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Familia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;

    private LocalDateTime dataCriacao;

    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL)
    private List<Membro> membros = new ArrayList<>();

    public Familia(UUID id, String nome){
        this.id = id;
        this.nome = nome;
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

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
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

    public String getInformacoesFamilia(){
        return "Família"+ nome + "membros"+ membros.size() + "Data criação" + getDataCriacao();
    }



}

