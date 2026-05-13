package cts.Florea.Claudia.gNrGrupa.Command.model;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
    private String nume;
    private List<IComanda> comenzi;

    public Ospatar(String nume) {
        this.nume = nume;
        this.comenzi = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public List<IComanda> getComenzi() {
        return comenzi;
    }

    //esentialul vor fi doua metode aici: preiacomanda si transmitecomanda

    public void preiaComanda(IComanda comanda) {
        this.comenzi.add(comanda); // ← acumulează
    }

    public void transmiteComenzile() {
        for(IComanda c : this.comenzi)
            c.prelucreaza(); // ← execută după un timp
        this.comenzi.clear();
    }


}
