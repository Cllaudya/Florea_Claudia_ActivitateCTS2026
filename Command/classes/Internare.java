package Command.classes;

public class Internare implements Icomanda{
    private Pacient pacient;

    public Internare(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void lanseazaComanda() {
        pacient.internare();
    }
}
