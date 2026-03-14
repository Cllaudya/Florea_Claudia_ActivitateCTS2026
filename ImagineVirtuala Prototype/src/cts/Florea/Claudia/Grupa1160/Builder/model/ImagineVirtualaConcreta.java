package cts.Florea.Claudia.Grupa1160.Builder.model;

import cts.Florea.Claudia.Grupa1160.Prototype.model.ImagineVirtuala;

import java.util.ArrayList;
import java.util.List;

public class ImagineVirtualaConcreta implements IImagineVirtuala {
    private int dimensiune;
    private List<String> listaAplicatiiInstalate=new ArrayList<>();

    private ImagineVirtualaConcreta(int dimensiune, List<String> listaAplicatiiInstalate) {
        this.dimensiune = dimensiune;
        this.listaAplicatiiInstalate = listaAplicatiiInstalate;
    }

    @Override
    public List<String> getAplicatiiInstalate() {
        return listaAplicatiiInstalate;
    }

    @Override
    public void afiseazaDescriereImagineVirtuala() {
        System.out.println("Pisica gri");

    }

    @Override
    public void instaleazaAplicatie(String numeAplicatie) {
        System.out.println("Imaginea creata este finala");
    }

    @Override
    public String toString() {
        return "ImagineVirtualaConcreta{" +
                "dimensiune=" + dimensiune +
                ", listaAplicatiiInstalate=" + listaAplicatiiInstalate +
                '}';
    }

   public static class ImagineVirtualaFinala implements IImagineBuilder{
       private int dimensiune;
       private List<String> listaAplicatiiInstalate=new ArrayList<>();


       public IImagineBuilder setDimensiune(int dimensiune) {
           this.dimensiune = dimensiune;
           return this;
       }

       public IImagineBuilder setListaAplicatiiInstalate(List<String> listaAplicatiiInstalate) {
           this.listaAplicatiiInstalate = listaAplicatiiInstalate;
           return this;
       }

       @Override
       public void afiseazaDescriereImagineVirtuala() {

       }

       @Override
       public void instaleazaAplicatie(String numeAplicatie) {

       }

       @Override
       public ImagineVirtualaConcreta build() {
           return new ImagineVirtualaConcreta(dimensiune, listaAplicatiiInstalate);
       }

       @Override
       public ImagineVirtuala setListaAplicatiiInstalate(ArrayList arrayList) {
           return null;
       }
   }

}
