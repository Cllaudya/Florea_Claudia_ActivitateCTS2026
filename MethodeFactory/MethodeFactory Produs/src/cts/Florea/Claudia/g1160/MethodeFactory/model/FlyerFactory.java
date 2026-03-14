package cts.Florea.Claudia.g1160.MethodeFactory.model;

public class FlyerFactory implements IFabrica {
    @Override
    public ProdusMarketing creareProdus(String numeClient, String domeniuActivitate, int latime, int inaltime) {
        return new Flyer(numeClient,domeniuActivitate,latime,inaltime);
    }

}
