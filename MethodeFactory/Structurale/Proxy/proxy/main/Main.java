package proxy.main;

import proxy.model.Ispital;
import proxy.model.Pacient;
import proxy.model.ProxySpital;
import proxy.model.Spital;

public class Main {


    public static  void main(String[] args) {


        Pacient pacient = new Pacient("Popescu", false);
        Spital spital = new Spital(pacient, "Universitar");
        spital.interneazaPacient();

        ProxySpital proxySpital = new ProxySpital(spital);
        proxySpital.interneazaPacient();


    }


}
