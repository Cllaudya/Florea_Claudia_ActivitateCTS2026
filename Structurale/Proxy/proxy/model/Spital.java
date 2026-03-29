package proxy.model;

public class Spital implements Ispital{

    private Pacient pacient;
    private String numeSpital;

    public Spital(Pacient pacient, String numeSpital) {
        this.pacient = pacient;
        this.numeSpital = numeSpital;
    }

    public Pacient getPacient() {
        return pacient;
    }

    @Override
    public void interneazaPacient() {
        System.out.println("S-a internat pacientul");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spital{");
        sb.append("pacient=").append(pacient);
        sb.append(", numeSpital='").append(numeSpital).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
