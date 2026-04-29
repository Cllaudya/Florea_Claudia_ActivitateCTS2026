package Observer.classes;

public class Pacient implements Iobserver{
    private String numePacient;
    private int varsta;

    public Pacient(String numePacient, int varsta) {
        this.numePacient = numePacient;
        this.varsta = varsta;
    }



    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println(numePacient + " a receptionat mesajul!" + mesaj);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
