package com.nessartk.bora_familia;

import java.util.List;

public class Usuario {
    private String nome;
    private PapelNaFamilia papelNaFamilia;
    private String email;
    private String image;
    Agenda agenda;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PapelNaFamilia getPapelNaFamilia() {
        return papelNaFamilia;
    }

    public PapelNaFamilia setPapelNaFamilia(PapelNaFamilia papelNaFamilia) {
        return papelNaFamilia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
