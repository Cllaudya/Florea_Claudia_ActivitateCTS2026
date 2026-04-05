package adapter.model.proiectExistent;

public class Pachet implements IPachet{

    private String destinatie;
    private float pret;
    private int nrNopti;

    public Pachet(String destinatie, float pret, int nrNopti) {
        this.destinatie = destinatie;
        this.pret = pret;
        this.nrNopti = nrNopti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrNopti=").append(nrNopti);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void vindePachet() {
        System.out.println("S-a vandut pachetul cu destinatia "+this.destinatie);
    }
}
