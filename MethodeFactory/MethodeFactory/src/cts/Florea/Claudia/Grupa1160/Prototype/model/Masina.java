package cts.Florea.Claudia.Grupa1160.Prototype.model;

public class Masina implements  IMasina{
    private String model;
    private int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getCuloareComponenta() {
        return "";
    }

    @Override
    public String tipMaterial() {
        return "";
    }

    @Override
    public boolean esteDetasabila() {
        return false;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}


