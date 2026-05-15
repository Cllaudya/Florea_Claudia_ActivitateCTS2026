package cts.main;

import cts.model.AbstractElementTransport;
import cts.model.NodTransport;
import cts.model.Statie;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) throws Exception {
        Statie s1=new Statie("Gara",100);
        Statie s2=new Statie("GaraNord",150);

        NodTransport n1=new NodTransport("Bucuresti");
        n1.adaugaNod(s1);

        System.out.println("numaeul total de pasageri"+n1.calculeazaNumarPasageri());


    }
}
