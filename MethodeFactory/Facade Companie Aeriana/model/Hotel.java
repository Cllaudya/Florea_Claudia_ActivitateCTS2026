package facade.model;

public class Hotel {

    private String numeHotel;
    private int pretNoapte;
    private String orasHotel;

    public Hotel(String numeHotel, int pretNoapte, String orasHotel) {
        this.numeHotel = numeHotel;
        this.pretNoapte = pretNoapte;
        this.orasHotel = orasHotel;
    }

    public void inchiriazaCameraHotel(){
        System.out.println("s-a inchiriat camera la hotelul "+this.numeHotel+" din "+this.orasHotel);

    }

}
