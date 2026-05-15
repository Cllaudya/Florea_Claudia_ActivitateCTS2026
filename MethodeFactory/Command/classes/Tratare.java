package Command.classes;

public class Tratare implements Icomanda {

    private Pacient pacient;

    public Tratare(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void lanseazaComanda() {
        pacient.tratare();
    }
}
