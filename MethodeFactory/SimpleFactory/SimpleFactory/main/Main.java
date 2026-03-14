package SimpleFactory.main;

import cts.lucrare.cts.Florea.Claudia.g1160.SimpleFactory.model.FabricaProduse;
import cts.lucrare.cts.Florea.Claudia.g1160.SimpleFactory.model.ProdusMarketing;
import cts.lucrare.cts.Florea.Claudia.g1160.SimpleFactory.model.TipProdus;

public class Main {
    public static void main(String [] args) {
       ProdusMarketing poster=FabricaProduse.getProdus(TipProdus.Poster,"Florescu","IT",15,90);
        ProdusMarketing flyer=FabricaProduse.getProdus(TipProdus.Flyer,"Mihailescu","Finante",25,78);
        ProdusMarketing stiker=FabricaProduse.getProdus(TipProdus.Stiker,"Barbulescu","Audit",5,9);
        ProdusMarketing poster2=FabricaProduse.getProdus(TipProdus.Poster,"Burciulescu","Conta",55,89);

        System.out.println(poster.toString());
        System.out.println(flyer.toString());
        System.out.println(stiker.toString());
        System.out.println(poster2.toString());

    }


}
