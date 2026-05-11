package cts.Florea.Claudia.g1160.Observer.model;

import java.util.ArrayList;
import java.util.List;

public class Camera implements CameraCCTV, Subject {
    public String denumire;
    private List<Observer> observeri;

    public Camera(String denumire) {
        this.denumire = denumire;
        this.observeri = new ArrayList<>();
    }

    @Override
    public void transmiteImagini() {
        System.out.println(denumire +"trasnmite imagini");
    }
    @Override
    public boolean activareSenzorMiscare() {

        System.out.println("Senzor de miscare detectat"+ denumire);
        trimiteNotificare("Miscarea a fost detectata");

        return true;
    }

    @Override
    //adauga un administrator in lista ca e goala lista noastra
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }
    @Override
    //sterge un administrator din lista
    public void stergeObserver(Observer observer) {
        observeri.remove(observer);
    }
    @Override
    //trimite o notificare catre un administrator
    //parcurgem lista si anuntam pe toti
    public void trimiteNotificare(String mesaj) {
        for(Observer observer : observeri){
            observer.receptionareMesaj(denumire+"-"+ mesaj);
        }
    //fiecare administrator primeste mesajul
    }
}
