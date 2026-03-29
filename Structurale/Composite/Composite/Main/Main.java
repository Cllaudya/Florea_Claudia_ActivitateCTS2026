package Composite.Main;

import Composite.Model.DepartamentComposite;
import Composite.Model.ISpital;
import Composite.Model.SectieFrunza;

public class Main {

    public static void main(String[] args) throws Exception {

        ISpital departament1 = new DepartamentComposite("Obstretica si Ginecologie");
        ISpital sectie = new SectieFrunza("obstretica");
        ISpital sectie2 = new SectieFrunza("gineco");

        ISpital departament2 = new DepartamentComposite("Medicina Generala");
        ISpital departament3 = new DepartamentComposite("Medicina Interna");
        ISpital sectie3 = new SectieFrunza("gastro");

        departament1.adaugaNod(sectie);
        departament1.adaugaNod(sectie2);

        departament2.adaugaNod(departament3);
        departament3.adaugaNod(sectie3);

        departament1.descriere("->");
        departament2.descriere("->");



    }



}
