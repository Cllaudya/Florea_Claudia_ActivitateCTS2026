package command.classes;

public class ComandaRezervare implements IComanda{
    private IPachet pachet;

    public ComandaRezervare(IPachet pachet) {
        this.pachet = pachet;
    }

    @Override
    public void executa() {
        pachet.rezervaPachet();
    }
}
