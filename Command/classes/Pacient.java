package Command.classes;

public class Pacient implements Ipacient{

    private String numePacient;
    private int varsta;

    public Pacient(String numePacient, int varsta) {
        this.numePacient = numePacient;
        this.varsta = varsta;
    }

    @Override
    public void internare() {
        System.out.println("Pacientul a fost internat " + numePacient);
    }

    @Override
    public void tratare() {
        System.out.println("Pacientul a fost tratat " + numePacient);
    }


    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
