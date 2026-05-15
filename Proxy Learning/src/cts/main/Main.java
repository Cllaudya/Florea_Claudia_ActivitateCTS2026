package cts.main;

import cts.model.CursReal;
import cts.model.Proxy;
import cts.model.Utilizator;

public class Main {
    public static void main(String [] args) {
        CursReal cursReal=new CursReal("CTS");

        Proxy proxy=new Proxy(cursReal);

        Utilizator u1=new Utilizator("Ionescu","premium");
        Utilizator u2=new Utilizator("Vasilescu","profesor");
        Utilizator u3=new Utilizator("Iancu","obisnuit");

        proxy.afiseazaContinut(u1.getTipUtilizator());
        proxy.afiseazaContinut(u2.getTipUtilizator());
        proxy.afiseazaContinut(u3.getTipUtilizator());





    }
}
