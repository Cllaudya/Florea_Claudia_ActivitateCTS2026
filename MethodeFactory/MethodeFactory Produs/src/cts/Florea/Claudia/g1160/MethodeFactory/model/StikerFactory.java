package cts.Florea.Claudia.g1160.MethodeFactory.model;

public class StikerFactory implements IFabrica{
    @Override
    public ProdusMarketing creareProdus(String numeClient, String domeniuActivitate, int latime, int inaltime) {
        return new Stiker(numeClient,domeniuActivitate,latime,inaltime);
    }
}
