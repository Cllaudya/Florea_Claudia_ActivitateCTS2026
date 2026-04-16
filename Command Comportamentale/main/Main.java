package command.main;

import command.classes.*;

public class Main {

    public static void main(String[] args) {
        IPachet pachetCazare = new PachetCazare(300,"Roma");
        IComanda comandaRez = new ComandaRezervare(pachetCazare);
        IComanda comandaVanzare = new ComandaVanzare(pachetCazare);

        Operator operator = new Operator();
        operator.lanseazaComanda(comandaRez);
        operator.lanseazaComanda(comandaVanzare);

    }
}
