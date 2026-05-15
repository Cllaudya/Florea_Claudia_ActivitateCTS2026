package cts.model;

public class Utilizator {
    private String nume;
    private String tipUtilizator;

    public Utilizator(String nume, String tipUtilizator) {
        this.nume = nume;
        this.tipUtilizator = tipUtilizator;
    }

    public String getNume() {
        return nume;
    }

    public String getTipUtilizator() {
        return tipUtilizator;
    }
}
