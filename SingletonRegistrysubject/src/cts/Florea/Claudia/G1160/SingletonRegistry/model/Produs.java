package cts.Florea.Claudia.G1160.SingletonRegistry.model;

import java.util.HashMap;
import java.util.Map;

public class Produs implements IProdusGeneric {
    private float pret;
    private int nrProduse;
    private String numeProdus;

    // Registrul de instanțe
    private static Map<String, IProdusGeneric> produse = new HashMap<>();

    // Constructor privat - l-am adaptat la 3 parametri (pret, stoc, nume)
    private Produs(float pret, int nrProduse, String numeProdus) {
        this.pret = pret;
        this.nrProduse = nrProduse;
        this.numeProdus = numeProdus;
    }

    // Metoda Singleton Registry
    public static synchronized IProdusGeneric getInstance(String nume, int stoc) {
        if (!produse.containsKey(nume)) {
            // Dacă nu există, creăm produsul (am pus un pret default de 100)
            IProdusGeneric produs = new Produs(100.0f, stoc, nume);
            produse.put(nume, produs);
        } else {
            // Dacă există, doar actualizăm stocul
            produse.get(nume).crestereStoc(stoc);
        }
        // FOARTE IMPORTANT: Trebuie să returnăm obiectul din Map
        return produse.get(nume);
    }

    @Override
    public float getStoc() {
        return this.nrProduse;
    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println("Produs: " + numeProdus + " | Stoc: " + nrProduse);
    }

    @Override
    public String getNumeProdus() {
        return this.numeProdus;
    }

    @Override
    public void crestereStoc(int nrProduseAdaugate) {
        this.nrProduse += nrProduseAdaugate;
    }
}