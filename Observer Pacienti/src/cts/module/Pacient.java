package cts.module;

import java.util.ArrayList;
import java.util.List;

public class Pacient implements AbstractPacientMonitorizat {
    private String nume;
    private String stare;
    private List<AbstractModulNotificare> module;

    public Pacient(String nume, String stare, List<AbstractModulNotificare> module) {
        this.nume = nume;
        this.stare = stare;
        this.module = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getStare() {
        return stare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public void setModule(List<AbstractModulNotificare> module) {
        this.module = module;
    }

    public List<AbstractModulNotificare> getModule() {
        return module;
    }

    @Override
    public void adaugaModul(AbstractModulNotificare modul) {
        this.module.add(modul);

    }

    @Override
    public void eliminaModul(AbstractModulNotificare modul) {

    }

    @Override
    public void notificaModule() {
        for(AbstractModulNotificare modul: module){
            modul.actualizeaza(stare);

        }

    }
}
