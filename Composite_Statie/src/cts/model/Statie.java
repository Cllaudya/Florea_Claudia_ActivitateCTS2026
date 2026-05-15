package cts.model;

public class Statie implements AbstractElementTransport,IComposite{
    private String nume;
    private int nrPasageri;

    public Statie(String nume, int nrPasageri) {
        this.nume = nume;
        this.nrPasageri = nrPasageri;
    }

    public String getNume() {
        return nume;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    @Override
    public int calculeazaNumarPasageri() {
        return nrPasageri;
    }

    @Override
    public boolean verificaCapacitate(int capacitateMaxima) {
        return nrPasageri<=capacitateMaxima;
    }

    @Override
    public void stergeNod(IComposite iComposite) throws Exception {
        throw new Exception("Nu este implementata");

    }

    @Override
    public void adaugaNod(IComposite iComposite) throws Exception {
        throw new Exception("Nu este implementata");

    }

    @Override
    public IComposite getNod(int index) throws Exception {
        throw new Exception("Nu este implementata");
    }
}
