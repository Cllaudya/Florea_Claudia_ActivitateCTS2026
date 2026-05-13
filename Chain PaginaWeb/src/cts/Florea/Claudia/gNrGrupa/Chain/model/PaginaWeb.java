package cts.Florea.Claudia.gNrGrupa.Chain.model;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb {
    private String nume;
    private List<Item> items;

    public PaginaWeb(String nume) {
        this.nume = nume;
        this.items = new ArrayList<>();
    }

    public void adaugaItem(Item item){
        items.add(item);
    }
    public String getNume() {
        return nume;
    }

    public List<Item> getItems() {
        return items;
    }


}
