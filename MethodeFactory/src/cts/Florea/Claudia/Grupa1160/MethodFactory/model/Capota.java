package cts.Florea.Claudia.Grupa1160.MethodFactory.model;

public class Capota implements IComponenta{
    private String culoare;
    private String tipMaterial;
    private boolean esteDetasabila;

    public Capota(String culoare, String tipMaterial, boolean esteDetasabila) {
        this.culoare = culoare;
        this.tipMaterial = tipMaterial;
        this.esteDetasabila = esteDetasabila;
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
        return "Capota{" +
                "culoare='" + culoare + '\'' +
                ", tipMaterial='" + tipMaterial + '\'' +
                ", esteDetasabila=" + esteDetasabila +
                '}';
    }
}
