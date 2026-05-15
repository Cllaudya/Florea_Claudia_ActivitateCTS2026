package Flyweight.model;

public class Pacient implements IPacient {

    private String numePacient;
    private String numarTelefon;
    private String adresa;

    public Pacient(String numePacient, String numarTelefon, String adresa) {
        this.numePacient = numePacient;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Salon salon) {
        System.out.println(this.toString()+ salon.toString());
    }
}
