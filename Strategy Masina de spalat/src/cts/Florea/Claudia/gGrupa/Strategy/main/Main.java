package cts.Florea.Claudia.gGrupa.Strategy.main;

import cts.Florea.Claudia.gGrupa.Strategy.model.AlbePS;
import cts.Florea.Claudia.gGrupa.Strategy.model.LanaPS;
import cts.Florea.Claudia.gGrupa.Strategy.model.MasinaSpalat;
import cts.Florea.Claudia.gGrupa.Strategy.model.NegrePS;

public class Main {
    static void main(String[] args) {
        MasinaSpalat masina1=new MasinaSpalat();
        MasinaSpalat masina2=new MasinaSpalat();
        MasinaSpalat masina3=new MasinaSpalat();

        //ce putin 3 program diferite alese la runtime:

        masina1.setProgramspalare(new AlbePS());
        masina1.porneste();

        masina1.setProgramspalare(new LanaPS());
        masina1.porneste();

        masina1.setProgramspalare(new NegrePS());
        masina1.porneste();


    }
}
