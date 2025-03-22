package com.nika.musicbox.modelos;// título, duração, total de reproduções,

// curtidas e classificação
public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes = 0;
    private int curtidas = 0;
    private int classificacao;

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        this.curtidas = curtidas + 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void reproduzir() {
        this.totalDeReproducoes = totalDeReproducoes + 1;
    }
}
