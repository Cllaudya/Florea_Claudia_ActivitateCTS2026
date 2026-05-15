package cts.Florea.Claudia.g1160.MethodeFactory.main;

import cts.Florea.Claudia.g1160.MethodeFactory.model.FlyerFactory;
import cts.Florea.Claudia.g1160.MethodeFactory.model.IFabrica;
import cts.Florea.Claudia.g1160.MethodeFactory.model.PosterFactory;
import cts.Florea.Claudia.g1160.MethodeFactory.model.StikerFactory;

public class Main {

    private static void creareProdus(IFabrica fabrica,String numeClient,String domeniuActivitate,int latime,int inaltime ){
        System.out.println(fabrica.creareProdus(numeClient,domeniuActivitate,latime,inaltime).toString());


    }
    public static void main(String[] arg) {
        creareProdus(new PosterFactory(),"Popescu","IT",55,89);
        creareProdus(new FlyerFactory(),"Topala","Finante",65,99);
        creareProdus(new StikerFactory(),"Florea","Comert",45,29);
        creareProdus(new StikerFactory(),"Ion","Marketing",55,89);


    }
}
