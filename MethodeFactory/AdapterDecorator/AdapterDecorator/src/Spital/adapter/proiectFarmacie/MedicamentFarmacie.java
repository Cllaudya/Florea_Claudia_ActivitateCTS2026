package Spital.adapter.proiectFarmacie;

public class MedicamentFarmacie implements ImedicamentFarmacie{

    private String numeMedicament;
    private float pret;
    private boolean esteNecesaraReteta;

    public MedicamentFarmacie(String numeMedicament, float pret, boolean esteNecesaraReteta) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
        this.esteNecesaraReteta = esteNecesaraReteta;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("S-a cumparat Medicamentul de la farmacie");
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentFarmacie{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", esteNecesaraReteta=").append(esteNecesaraReteta);
        sb.append('}');
        return sb.toString();
    }
}
