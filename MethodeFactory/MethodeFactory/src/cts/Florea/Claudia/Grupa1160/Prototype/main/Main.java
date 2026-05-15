package cts.Florea.Claudia.Grupa1160.Prototype.main;

import cts.Florea.Claudia.Grupa1160.Prototype.model.Prototype;
import cts.Florea.Claudia.Grupa1160.Prototype.model.Stiker;

public class Main {
    public static void main(String[] args) {
        Prototype stiker1 = new Stiker("Jira", 1990);
        Prototype stiker2 = stiker1.copiaza();
        System.out.println(stiker1.toString());
        System.out.println(stiker2.toString());

    }
}