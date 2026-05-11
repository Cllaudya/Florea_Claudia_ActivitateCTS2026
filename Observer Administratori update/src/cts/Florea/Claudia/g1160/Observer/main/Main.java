package cts.Florea.Claudia.g1160.Observer.main;

import cts.Florea.Claudia.g1160.Observer.model.Administrator;
import cts.Florea.Claudia.g1160.Observer.model.Camera;
import cts.Florea.Claudia.g1160.Observer.model.CameraCCTV;

public class Main {
    public static void main(String[] args) {
        //cream observerii adica administratorii
        Administrator administrator1 = new Administrator("Popescu");
        Administrator administrator2 = new Administrator("Ionescu");
        Administrator administrator3 = new Administrator("Vasilescu");

        //cream camera adica subiectul in cazul nostru

        Camera camera = new Camera("Camera1");
        //inregistram administratorii in lista camerei
        camera.adaugaObserver(administrator1);
        camera.adaugaObserver(administrator2);
        camera.adaugaObserver(administrator3);
        //activeaza senzorul sa primeasca toti 3 notificarea

        camera.activareSenzorMiscare();
    }
}
