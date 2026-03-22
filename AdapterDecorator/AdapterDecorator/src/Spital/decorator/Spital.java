package Spital.decorator;

public class Spital implements Ispital{

    private int pacientID;
    private String sectie;

    public Spital(int pacientID, String sectie) {
        this.pacientID = pacientID;
        this.sectie = sectie;
    }

    @Override
    public void printeazaRezultat() {
        System.out.println("Rezultatele se printeaza");
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spital{");
        sb.append("pacientID=").append(pacientID);
        sb.append(", sectie='").append(sectie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
