package com.nessartk.bora_familia;

public class Usuario {
    private String nome;
    private PapelNaFamilia papelNaFamilia;
    private String corPreferida;

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

    public String getCorPreferida() {
        return corPreferida;
    }

    public void setCorPreferida(String corPreferida) {
        this.corPreferida = corPreferida;
    }
}
