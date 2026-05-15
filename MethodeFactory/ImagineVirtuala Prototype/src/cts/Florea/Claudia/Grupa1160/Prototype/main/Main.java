package cts.Florea.Claudia.Grupa1160.Prototype.main;

import cts.Florea.Claudia.Grupa1160.Prototype.model.IImaginePrototype;
import cts.Florea.Claudia.Grupa1160.Prototype.model.ImagineVirtuala;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ImagineVirtuala imagine1=new ImagineVirtuala(55,new ArrayList<>());
        imagine1.instaleazaAplicatie("Chrome");
        imagine1.instaleazaAplicatie("AndroidPlus");
        imagine1.instaleazaAplicatie("Glovo");

        ImagineVirtuala imagine2=imagine1.copiaza();
        ImagineVirtuala imagine3=imagine1.copiaza();

        System.out.println(imagine1.toString());
        System.out.println(imagine2.toString());
        System.out.println(imagine3.toString());

    }
}
