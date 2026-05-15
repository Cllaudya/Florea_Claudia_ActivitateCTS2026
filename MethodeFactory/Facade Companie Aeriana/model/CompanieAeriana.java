package facade.model;

public class CompanieAeriana {
    private String numeCompAeriana;
    private int pretBilet;
    private int nrLoc;

    public CompanieAeriana(String numeCompAeriana, int pretBilet, int nrLoc) {
        this.numeCompAeriana = numeCompAeriana;
        this.pretBilet = pretBilet;
        this.nrLoc = nrLoc;
    }

    public  void rezervaBilet(){
        System.out.println("s-a rezervat biletul la compania "+this.numeCompAeriana);
    }

}
