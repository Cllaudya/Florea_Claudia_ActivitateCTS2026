package cts.lucrare.cts.Florea.Claudia.g1160.SimpleFactory.model;

public class Stiker extends ProdusMarketing{
    public Stiker (String numeClient, String domeniuActivitate, int latime,int inaltime){
        super(numeClient,domeniuActivitate,latime,inaltime);
    }
    @Override
    public String toString() {
        return "Stiker{" +
                "numeClient='" + numeClient + '\'' +
                ", domeniuActivitate='" + domeniuActivitate + '\'' +
                ", latime=" + latime +
                ", inaltime=" + inaltime +
                '}';
    }
}
