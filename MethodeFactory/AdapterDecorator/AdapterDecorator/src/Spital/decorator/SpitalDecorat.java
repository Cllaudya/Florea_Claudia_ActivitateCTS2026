package Spital.decorator;

public class SpitalDecorat extends Aspital{
    public SpitalDecorat(Ispital spital) {
        super(spital);
    }

    @Override
    public void afiseazaRezultatOnline() {
        System.out.println("S-a afisat rezultatul Online!");
    }
}
