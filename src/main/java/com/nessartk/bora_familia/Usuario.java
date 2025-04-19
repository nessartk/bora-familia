package com.nessartk.bora_familia;

public class Usuario {
    private String nome;
    private MembroDaFamilia membroDaFamilia;
    private String email;
    private String image;
    Agenda agenda;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MembroDaFamilia getMembroDaFamilia() {
        return membroDaFamilia;
    }

    public MembroDaFamilia setMembrolDaFamilia(MembroDaFamilia membroDaFamilia) {
        return membroDaFamilia;
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
