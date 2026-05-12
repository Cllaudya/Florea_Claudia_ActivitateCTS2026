package cts.Florea.Claudia.gGrupa.Strategy.model;

public class MasinaSpalat {
    private String nume;
    //de retinut ca vom avea ca atribut privat ProgramSplare in clasa concreta
    private ProgramSpalare programspalare;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ProgramSpalare getProgramspalare() {
        return programspalare;
    }

    public void setProgramspalare(ProgramSpalare programspalare) {
        this.programspalare = programspalare;
    }
    //lipseste metoda de executie care deleaga strategia
    //Aceasta este particularitatea Strategy — contextul
    // (MasinaSpalat) nu știe CUM se spală, doar apelează spala() pe strategia curentă.

    public void porneste(){
        programspalare.spala();
    }

}
