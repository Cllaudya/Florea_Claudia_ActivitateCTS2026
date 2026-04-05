package facade.model;

public class Facade {

public void rezervaPachet(String numeHotel, int pretNoapte, String orasHotel,String numeCompAeriana, int pretBilet, int nrLoc,
                          String numeBus, int pretBus, String marcaMasina){
    Hotel hotel = new Hotel(numeHotel,pretNoapte,orasHotel);
    hotel.inchiriazaCameraHotel();

    CompanieAeriana companieAeriana = new CompanieAeriana(numeCompAeriana,pretBilet,nrLoc);
    companieAeriana.rezervaBilet();

    CompanieBus companieBus = new CompanieBus(numeBus,pretBus,marcaMasina);
    companieBus.inchiriazaMasina();

}
}
