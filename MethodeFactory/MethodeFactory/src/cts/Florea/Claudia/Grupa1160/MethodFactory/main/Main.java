package cts.Florea.Claudia.Grupa1160.MethodFactory.main;

import cts.Florea.Claudia.Grupa1160.MethodFactory.model.CapotaFactory;
import cts.Florea.Claudia.Grupa1160.MethodFactory.model.IFactoryComponenta;
import cts.Florea.Claudia.Grupa1160.MethodFactory.model.UsaFactory;

public class Main {
    private static void creareComponenta(IFactoryComponenta componenta, String culoare, String tipMaterial, boolean esteDetasabila){
        System.out.println(componenta.creareComponenta(culoare,tipMaterial,esteDetasabila));
    }
    public static void main(String[] args) {
      creareComponenta(new CapotaFactory(),"Rosu","Otel",true);
      creareComponenta(new UsaFactory(),"Negru","Otel",false);
    }
}
