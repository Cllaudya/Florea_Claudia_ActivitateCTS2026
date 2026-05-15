package cts.Florea.Claudia.G1160.MethodeFactory.main;

import cts.Florea.Claudia.G1160.MethodeFactory.model.*;

public class Main {

    private static void method(IFactory factory, String nume, int stoc){
        IProdusGeneric produs=factory.createObject();
        produs.afiseazaDescriereProdus();
    }
    public static void main(String[] args) {
        ProdusBioFactory p1=new ProdusBioFactory();
        ProdusElectronicFactory p2=new ProdusElectronicFactory();
        ProdusPerisabilFactory p3=new ProdusPerisabilFactory();

        method(p1,"Miere bio",13);
        method(p2,"Mixer",3);
        method(p1,"Mere",23);



    }


}
