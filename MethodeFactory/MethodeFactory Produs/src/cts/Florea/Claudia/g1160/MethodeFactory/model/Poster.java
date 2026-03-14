package cts.Florea.Claudia.g1160.MethodeFactory.model;

public class Poster extends ProdusMarketing{
    public Poster (String numeClient,String domeniuActivitate,int latime,int inaltime){
        super(numeClient,domeniuActivitate,latime,inaltime);
    }

    @Override
    public String toString() {
        return "Poster{" +
                "numeClient='" + numeClient + '\'' +
                ", domeniuActivitate='" + domeniuActivitate + '\'' +
                ", latime=" + latime +
                ", inaltime=" + inaltime +
                '}';
    }
}
