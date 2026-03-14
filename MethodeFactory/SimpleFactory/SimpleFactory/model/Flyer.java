package cts.lucrare.cts.Florea.Claudia.g1160.SimpleFactory.model;

public class Flyer extends ProdusMarketing {
    public Flyer (String numeClient, String domeniuActivitate, int latime,int inaltime){
        super(numeClient,domeniuActivitate,latime,inaltime);
    }
    @Override
    public String toString() {
        return "Flyer{" +
                "numeClient='" + numeClient + '\'' +
                ", domeniuActivitate='" + domeniuActivitate + '\'' +
                ", latime=" + latime +
                ", inaltime=" + inaltime +
                '}';
    }
}
