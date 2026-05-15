package cts.model;

import java.util.ArrayList;
import java.util.List;

public class NodTransport implements AbstractElementTransport, IComposite {
    private String nume;
    private List<AbstractElementTransport> elemente;

    public NodTransport(String nume) {
        this.nume = nume;
        this.elemente = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public List<AbstractElementTransport> getElemente() {
        return elemente;
    }

    @Override
    public void stergeNod(IComposite iComposite) throws Exception {
        elemente.remove(elemente);
    }
    @Override
    public void adaugaNod(IComposite iComposite) throws Exception {
        elemente.add((AbstractElementTransport)iComposite);
    }
    @Override
    public IComposite getNod(int index) throws Exception {
        return (IComposite) elemente.get(index);
    }
    @Override
    public int calculeazaNumarPasageri() {
        return 0;
    }
    @Override
    public boolean verificaCapacitate(int capacitateMaxima) {
        return calculeazaNumarPasageri()<=capacitateMaxima;
    }

}
