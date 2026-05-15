package cts.model;

public class Proxy implements AbstractCurs {
    private String nume;
    private CursReal cursReal;

    public Proxy(CursReal cursReal) {
        this.nume = nume;
        this.cursReal = cursReal;
    }

    public String getNume() {
        return nume;
    }

    public CursReal getCursReal() {
        return cursReal;
    }

    @Override
    public void afiseazaContinut(String tipUtilizator) {
        if(tipUtilizator.equals("premium")||tipUtilizator.equals("profesor")){
            cursReal.afiseazaContinut(tipUtilizator);}

        else{
            System.out.println("Acces interzis!"+tipUtilizator);


        }

    }
}
