package cts.Florea.Claudia.Grupa1160.Builder.model;

import cts.Florea.Claudia.Grupa1160.Prototype.model.ImagineVirtuala;

import java.util.ArrayList;

public interface IImagineBuilder {
    void afiseazaDescriereImagineVirtuala();
    void instaleazaAplicatie(String numeAplicatie);
    ImagineVirtualaConcreta build();

    ImagineVirtuala setListaAplicatiiInstalate(ArrayList arrayList);
}
