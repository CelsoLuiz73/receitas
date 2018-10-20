package com.celsoluiz73.receitas.modelo;
// recyclerView - passo 1: criar a classe modelo que será a fonte de dados
// ver passo 2 em content_home.xml, onde um container é criado para suportar o recyclerview
// na forma de um fragment
public class Receita {
    private String nome;
    private String descricao;
    private int imagem;

    public Receita(String nome, String descricao, int imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
