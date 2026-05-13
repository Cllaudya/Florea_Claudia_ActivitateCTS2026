package cts.Florea.Claudia.gNrGrupa.Command.main;

import cts.Florea.Claudia.gNrGrupa.Command.model.*;

public class Main {
    public static void main(String [] args) {
        //cream receiverii
        PachetTuristic cazare=new PacheteCazare(23);
        PachetTuristic transport=new PacheteCazare(33);

        //cream comenzile
        IComanda c1=new ComandaRezervare(cazare);
        IComanda c2=new ComandaRezervare(transport);
        IComanda c3=new ComandaRezervare(cazare);

        //cream operatorul

        Ospatar ospatar=new Ospatar("popescu");

        //preluam comenzile

        ospatar.preiaComanda(c1);
        ospatar.preiaComanda(c2);
        // dupa un timp → transmite comenzile
        ospatar.transmiteComenzile();



    }
}
