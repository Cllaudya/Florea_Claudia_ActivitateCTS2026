package Spital.decorator;

public abstract class Aspital implements Ispital {

  protected Ispital spital;

    @Override
    public void printeazaRezultat() {
        spital.printeazaRezultat();
    }

    public abstract void afiseazaRezultatOnline();

    public Aspital(Ispital spital) {
        this.spital = spital;
    }
}
