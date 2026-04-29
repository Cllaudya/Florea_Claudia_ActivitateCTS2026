package Observer.main;

import Observer.classes.Ispital;
import Observer.classes.Pacient;
import Observer.classes.Spital;

import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {

       Pacient pacient1 = new Pacient("Pacient1", 25);
       Pacient pacient2 = new Pacient("Pacient2", 45);
       Pacient pacient3 = new Pacient("Pacient3", 55);

       List<Pacient> lista = new ArrayList<>();
       lista.add(pacient1);
       lista.add(pacient2);
       lista.add(pacient3);


       Spital spital = new Spital(lista);

       spital.notificaEpidemie();
       spital.notificaVirusi();

    }

}
