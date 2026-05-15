package Adapter.main;

import Adapter.model.CandidatExternAdapter;
import Adapter.model.PlatformaInterna.AbstractCandidatPlatforma;
import Adapter.model.PlatformaInterna.Candidat;
import Adapter.model.SistemExtern.CVExtern;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {

        AbstractCandidatPlatforma c1=new Candidat("Popescu Ion", 3, new String[]{"Java", "SQL"});
        AbstractCandidatPlatforma c2=new Candidat("Popescu Ioan", 3, new String[]{"Java", "C++"});

        System.out.println(c1.obtineAniExperienta());
        System.out.println(Arrays.toString(c1.obtineCompetente()));

        System.out.println(c2.obtineAniExperienta());
        System.out.println(Arrays.toString(c2.obtineCompetente()));

        CVExtern cvExtern=new CVExtern("FloreaClaudia",5,new String[]{"POO","FDI"});
        AbstractCandidatPlatforma c3=new CandidatExternAdapter(cvExtern);

        System.out.println(c3.obtineAniExperienta());
        System.out.println(Arrays.toString(c3.obtineCompetente()));





    }
}
