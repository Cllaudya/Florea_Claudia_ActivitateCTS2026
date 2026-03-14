package cts.Florea.Claudia.g1160.MethodeFactory.model;

public class PosterFactory implements IFabrica{

    @Override
    public ProdusMarketing creareProdus(String numeClient, String domeniuActivitate, int latime, int inaltime) {
        return new Poster(numeClient,domeniuActivitate,latime,inaltime);
    }
}
