package Flyweight.model;

public class Salon {

    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;


    public Salon(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salon{");
        sb.append("numarSalon=").append(numarSalon);
        sb.append(", numarPat=").append(numarPat);
        sb.append(", numarZileSpitalizare=").append(numarZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
