package cts.Florea.Claudia.gNrGrupa.Command.model;

public class ComandaVanzare implements IComanda{
    private PachetTuristic pachet;

    public ComandaVanzare(PachetTuristic pachet) {
        this.pachet = pachet;
    }

    @Override
    public void prelucreaza() {
        this.pachet.vanzare();

    }
}
