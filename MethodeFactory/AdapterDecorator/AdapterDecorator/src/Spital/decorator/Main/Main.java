package Spital.decorator.Main;

import Spital.decorator.Aspital;
import Spital.decorator.Ispital;
import Spital.decorator.Spital;
import Spital.decorator.SpitalDecorat;

public class Main {

    public static void main(String [] args){

        Ispital spital = new Spital(1, "Orl");
        spital.printeazaRezultat();
        Aspital spitalDecorat = new SpitalDecorat(spital);
        spitalDecorat.afiseazaRezultatOnline();
        spitalDecorat.printeazaRezultat();


    }
}
