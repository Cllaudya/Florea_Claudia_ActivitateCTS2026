package cts.Florea.Claudia.g1160.Observer.model;

import java.util.List;

public class Camera implements CameraCCTV, Subject {
    public String denumire;
    List<Observer> observeri;

    @Override
    public void transmiteImagini() {

    }

    @Override
    public boolean activareSenzorMiscare() {
        return false;
    }

    @Override
    public void adaugaObserver(Observer observer) {

    }

    @Override
    public void stergeObserver(Observer observer) {

    }

    @Override
    public void trimiteNotificare(String mesaj) {

    }
}
