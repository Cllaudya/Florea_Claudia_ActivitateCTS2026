package Spital.adapter.proiectSpital;

public class Medicament implements Imedicament {

    private String numeMedicament;
    private float pret;
    private boolean esteNecesaraReteta;

    public Medicament(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    @Override
    public void achizitionezaMedicament() {
        if(prezintReteta()==true){
            System.out.println("S-a achizitionat medicamentul" + numeMedicament);
        } else{
            System.out.println("Nu este nevoie de reteta");
        }


    }

    @Override
    public boolean prezintReteta() {
        return esteNecesaraReteta;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
