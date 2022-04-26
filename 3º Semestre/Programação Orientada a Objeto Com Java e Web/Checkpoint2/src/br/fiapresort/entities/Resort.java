package br.fiapresort.entities;

public class Resort {

    public String cidade;
    public int categoria;
    public String fone;

    public Resort(String cidade, int categoria, String fone) {
        this.cidade = cidade;
        this.categoria = categoria;
        this.fone = fone;
    }

    public String getDados() {
        return "Resort: " + "Cidade: " + cidade + " Categoria: " + categoria + " Fone: " + fone;
    }
}
