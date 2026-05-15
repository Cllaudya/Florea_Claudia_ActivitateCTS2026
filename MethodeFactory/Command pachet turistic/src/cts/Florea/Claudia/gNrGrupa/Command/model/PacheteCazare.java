package cts.Florea.Claudia.gNrGrupa.Command.model;

public class PacheteCazare implements PachetTuristic{
    private int cod;

    public PacheteCazare(int cod) {
        this.cod = cod;
    }

    @Override
    public void rezerva() {
        System.out.println("Pachetul de cazare"+ cod + "a fost rezervat");

    }
    @Override
    public void vanzare() {
        System.out.println("Pachetul de cazare"+ cod + "a fost vandut");

    }
}
