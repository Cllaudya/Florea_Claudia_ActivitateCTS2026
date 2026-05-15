package cts.Florea.Claudia.G1160.SingletonRegistry.main;

import cts.Florea.Claudia.G1160.SingletonRegistry.model.IProdusGeneric;
import cts.Florea.Claudia.G1160.SingletonRegistry.model.Produs;

public class Main {
    public static void main(String[] args) {
        IProdusGeneric p1 = Produs.getInstance("Laptop", 5);
        IProdusGeneric p2 = Produs.getInstance("Calculator", 15);
        IProdusGeneric p3 = Produs.getInstance("Laptop", 15);

        p1.afiseazaDescriereProdus();
        p2.afiseazaDescriereProdus();
        p3.afiseazaDescriereProdus();

        System.out.println("sunt p1 si p3 identice?"+(p1==p3));

    }
}
