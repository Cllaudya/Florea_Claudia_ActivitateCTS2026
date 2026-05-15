package adapter.model.proiectNou;

public class Masina implements IMasina{

    private String model;
    private int nrKm;
    private String culoare;

    public Masina(String model, int nrKm, String culoare) {
        this.model = model;
        this.nrKm = nrKm;
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrKm=").append(nrKm);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void inchiriazaMasina() {
        System.out.println("S-a inchiriat masina "+this.model);
    }
}
