package br.fiapresort.main;

import br.fiapresort.entities.*;

public class Main {

    public static Reserva[] reservas = new Reserva[4];
    public static Hospede[] hospedes = new Hospede[4];

    public static void main(String[] args) {
        Hospede h1 = new Hospede("123123123", "José", 0);
        Hospede h2 = new Hospede("245645645", "Maria", 0);
        Hospede h3 = new Hospede("675675677", "Pedro", 0);
        Hospede h4 = new Hospede("089089089", "João", 0);

        Resort r1 = new Resort("São Paulo", 1, "11-1111-1111");
        Resort r2 = new Resort("Rio de Janeiro", 2, "11-2222-2222");

        hospedes[0] = h1;
        hospedes[1] = h2;
        hospedes[2] = h3;
        hospedes[3] = h4;

        Reserva res1 = new Reserva("01/01/2020", r1, h1);
        Reserva res2 = new Reserva("02/01/2020", r2, h2);
        Reserva res3 = new Reserva("03/01/2020", r1, h3);
        Reserva res4 = new Reserva("26/04/2022", r1, h2);

        reservas[0] = res1;
        reservas[1] = res2;
        reservas[2] = res3;
        reservas[3] = res4;

        System.out.println("Hospedes com reservas:");
        System.out.println("---------------------");
        for (Hospede hospede : hospedes) {
            if (hospede.pontuação > 0) {
                System.out.println(hospede.getDados());
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Reservas em São Paulo para o dia 22/04/2022:");
        System.out.println("---------------------");

        for (Reserva reserva : reservas) {
            if (reserva.resort.cidade.equals("São Paulo") && reserva.data.equals("26/04/2022")) {
                System.out.println(reserva.getDados());
            }
        }
    }
}
