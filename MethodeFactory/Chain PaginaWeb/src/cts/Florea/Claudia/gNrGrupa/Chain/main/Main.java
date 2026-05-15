package cts.Florea.Claudia.gNrGrupa.Chain.main;

import cts.Florea.Claudia.gNrGrupa.Chain.model.*;

public class Main {
    public static void main(String[] args) {
        // cream item-urile
        Item i1 = new Item("Imagine", "jpg, 200px");
        Item i2 = new Item("paragraf", "bold, italic, red");
        // cream paginile si adaugam item-urile
        PaginaWeb pagina1 = new PaginaWeb("index.html");
        pagina1.adaugaItem(i1);
        pagina1.adaugaItem(i2);

        PaginaWeb pagina2 = new PaginaWeb("about.html");
        pagina2.adaugaItem(i2);
        pagina2.adaugaItem(i1);

        // cream filtrele si construim lantul
        Filtru filtruImagini = new FiltruImagini();
        Filtru filtruParagrafe = new FiltruParagrafe();
        filtruImagini.setUrmatorulFiltru(filtruParagrafe);

        // aplicam lantul pe pagini
        System.out.println("=== Aplicare filtre pagina1 ===");
        filtruImagini.aplicaFiltru(pagina1);

        System.out.println("=== Aplicare filtre pagina2 ===");
        filtruImagini.aplicaFiltru(pagina2);
    }
}