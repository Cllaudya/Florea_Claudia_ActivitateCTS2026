package cts.Florea.Claudia.Grupa1160.Prototype.model;

public class Stiker implements Prototype{
    private String model;
    private int anFabricatie;

    public Stiker(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    private Stiker() {
    }

    @Override
    public Prototype copiaza() {
        return new Stiker(this.model, this.anFabricatie);
    }

    @Override
    public String toString() {
        return "Stiker{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
