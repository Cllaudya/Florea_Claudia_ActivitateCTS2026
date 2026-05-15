package command.classes;

public class ComandaVanzare implements IComanda{

    private IPachet pachet;

    public ComandaVanzare(IPachet pachet) {
        this.pachet = pachet;
    }

    @Override
    public void executa() {
        pachet.vanzarePachet();
    }
}
