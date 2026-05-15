package proxy.model;

public class Pacient {

    private String numePacient;
    private boolean areCardSanatate;

    public Pacient(String numePacient, boolean areCardSanatate) {
        this.numePacient = numePacient;
        this.areCardSanatate = areCardSanatate;
    }

    public boolean isAreCardSanatate() {
        return areCardSanatate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", areCardSanatate=").append(areCardSanatate);
        sb.append('}');
        return sb.toString();
    }
}
