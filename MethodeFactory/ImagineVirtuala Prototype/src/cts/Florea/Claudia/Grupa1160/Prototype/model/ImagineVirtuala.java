package cts.Florea.Claudia.Grupa1160.Prototype.model;

import java.util.ArrayList;
import java.util.List;

public class ImagineVirtuala implements IImagineVirtuala,IImaginePrototype{
    private int dimensiune;
    private List<String> listaMesaje=new ArrayList<>();

    public ImagineVirtuala() {
    }

    public ImagineVirtuala(int dimensiune, List<String> listMesaje) {
        this.dimensiune = dimensiune;
        this.listaMesaje = listMesaje;
    }

    @Override
    public List<String> getAplicatiiInstalate() {
        return listaMesaje;
    }

    @Override
    public void afiseazaDescriereImagineVirtuala() {

    }

    @Override
    public void instaleazaAplicatie(String numeAplicatie) {
       listaMesaje.add(numeAplicatie);


    }

    @Override
    public String toString() {
        return "ImagineVirtuala{" +
                "dimensiune=" + dimensiune +
                ", listMesaje=" + listaMesaje +
                '}';
    }

    @Override
    public ImagineVirtuala copiaza() {
        List<String> listaNoua=new ArrayList<>(this.listaMesaje);
        ImagineVirtuala clona=new ImagineVirtuala();
        clona.dimensiune=this.dimensiune;
        clona.listaMesaje=listaNoua;
        return clona;
    }


}
