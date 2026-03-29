package Flyweight.main;

import Flyweight.model.FlyweightPacient;
import Flyweight.model.Pacient;
import Flyweight.model.Salon;

public class Main {

    public static void main(String[] args){

        Salon salon = new Salon(10, 101, 5);
        Salon salon1 = new Salon(25, 201, 2);
        Salon salon2 = new Salon(45, 145, 5);

        FlyweightPacient flyweightPacient = new FlyweightPacient();

        Pacient pacient1 = flyweightPacient.getPacient("Pacient", "0000000", "adresa1");
        pacient1.descriere(salon);
        pacient1.descriere(salon1);
        pacient1.descriere(salon2);


    }

}
