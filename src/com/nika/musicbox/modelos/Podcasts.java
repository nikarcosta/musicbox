package com.nika.musicbox.modelos;

public class Podcasts extends Audio{
    private String host;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 500){
            return 10;
        } else {
            return 5;
        }
    }
}


