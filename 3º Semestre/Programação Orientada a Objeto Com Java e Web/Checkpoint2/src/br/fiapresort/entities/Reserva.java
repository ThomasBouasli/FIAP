package br.fiapresort.entities;

public class Reserva {
    public String data;
    public Resort resort;
    public Hospede hospede;

    public Reserva(String data, Resort resort, Hospede hospede) {
        this.data = data;
        this.resort = resort;
        this.hospede = hospede;
        hospede.pontuação += 1;
    }

    public Reserva(Resort resort, Hospede hospede) {
        this.resort = resort;
        this.hospede = hospede;
    }

    public String getDados() {
        return "Reserva: " + "Data: " + data + " Resort: " + resort.getDados() + " Hospede: " + hospede.getDados();
    }
}
