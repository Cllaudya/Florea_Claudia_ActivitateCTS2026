package cts.Florea.Claudia.Grupa1160.Builder.main;

import cts.Florea.Claudia.Grupa1160.Builder.model.ImagineVirtualaConcreta;
import cts.Florea.Claudia.Grupa1160.Builder.model.IImagineVirtuala;



import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args) {
         List<String> laplicatii=new ArrayList<>();
         ImagineVirtuala imag1=new ImagineVirtualaConcreta.ImagineVirtualaFinala()
                 .setDimensiune(50)
                 .setListaAplicatiiInstalate((ArrayList)laplicatii)
                 .build();

    }
}
