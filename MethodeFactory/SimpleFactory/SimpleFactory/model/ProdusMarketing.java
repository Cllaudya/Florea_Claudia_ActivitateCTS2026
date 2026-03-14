package cts.lucrare.cts.Florea.Claudia.g1160.SimpleFactory.model;

public abstract class ProdusMarketing {
    protected String numeClient;
    protected String domeniuActivitate;
    protected int latime;
    protected int inaltime;

    public ProdusMarketing(String numeClient, String domeniuActivitate, int latime, int inaltime) {
        this.numeClient = numeClient;
        this.domeniuActivitate = domeniuActivitate;
        this.latime = latime;
        this.inaltime = inaltime;
    }
}