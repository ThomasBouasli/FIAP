package br.fiapresort.entities;

public class Hospede {
    public String cpf;
    public String nome;
    public int pontuação;

    public Hospede(String cpf, String nome, int pontuação) {
        this.cpf = cpf;
        this.nome = nome;
        this.pontuação = pontuação;
    }

    public String getDados() {
        return "Nome: " + nome + " CPF: " + cpf + " Pontuação: " + pontuação;
    }
}