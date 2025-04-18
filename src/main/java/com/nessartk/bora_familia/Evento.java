package com.nessartk.bora_familia;

import java.time.LocalDateTime;

public class Evento {
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraTermino;
    private String localizacao;
    private TipoEvento tipo;
    private Usuario responsavel;
    private boolean notificar;
    private boolean concluido;
    private String cor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHorarioInicio() {
        return dataHoraInicio;
    }

    public void setDataHorarioInicio(LocalDateTime dataHorarioInicio) {
        this.dataHoraInicio = dataHorarioInicio;
    }

    public LocalDateTime getDataHorarioTermino() {
        return dataHoraTermino;
    }

    public void setDataHorarioTermino(LocalDateTime dataHorarioTermino) {
        this.dataHoraTermino = dataHorarioTermino;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public boolean isNotificar() {
        return notificar;
    }

    public void setNotificar(boolean notificar) {
        this.notificar = notificar;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
