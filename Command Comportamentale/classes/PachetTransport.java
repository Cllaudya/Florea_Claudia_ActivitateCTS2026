package command.classes;

public class PachetTransport implements IPachet{
    private int pret;
    private String destinatie;

    public PachetTransport(int pret, String destinatie) {
        this.pret = pret;
        this.destinatie = destinatie;
    }


    @Override
    public void vanzarePachet() {
        System.out.println("Pachetul de transport cu destinatia "+this.destinatie+" s-a vandut");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Pachetul de transport cu destinatia "+this.destinatie+" s-a rezervat");
    }
}
