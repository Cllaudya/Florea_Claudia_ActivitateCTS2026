package cts.lucrare.cts.Florea.Claudia.g1160.SimpleFactory.model;

import com.sun.jdi.connect.Connector;

import static cts.lucrare.cts.Florea.Claudia.g1160.SimpleFactory.model.TipProdus.Poster;

public class FabricaProduse {

    public static ProdusMarketing getProdus(TipProdus tip,String numeClient,
                                     String domeniuActivitate,int latime,int inaltime){
        return switch(tip){
            case Poster ->new Poster (numeClient, domeniuActivitate, latime,inaltime);
            case Flyer ->new Flyer (numeClient, domeniuActivitate, latime,inaltime);
            case Stiker ->new Stiker (numeClient, domeniuActivitate, latime,inaltime);

            default->throw new IllegalArgumentException("Tip de produs necunoscut");
        };


    }

}
