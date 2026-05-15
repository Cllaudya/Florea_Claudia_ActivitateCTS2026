package facade.main;

import facade.model.CompanieAeriana;
import facade.model.CompanieBus;
import facade.model.Facade;
import facade.model.Hotel;

public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.rezervaPachet("ELLITE",300,"Roma","WIZZ",
                20,3,"FlixBus",10,"VITTo");

    }
}
