package cts.Florea.Claudia.gNrGrupa.Command.model;

public class ComandaRezervare implements IComanda{
    private PachetTuristic pachet;

    public ComandaRezervare(PachetTuristic pachet) {
        this.pachet = pachet;
    }

    @Override
    public void prelucreaza() {
    this.pachet.rezerva();// ← delegă către Receiver
    }
}
