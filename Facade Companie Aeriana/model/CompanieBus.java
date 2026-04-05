package facade.model;

public class CompanieBus {

    private String numeBus;
    private int pretBus;
    private String marcaMasina;

    public CompanieBus(String numeBus, int pretBus, String marcaMasina) {
        this.numeBus = numeBus;
        this.pretBus = pretBus;
        this.marcaMasina = marcaMasina;
    }

    public void inchiriazaMasina(){
        System.out.println("s-a inchiriat masia "+this.marcaMasina+" pt transfer la hotel");

    }
}
