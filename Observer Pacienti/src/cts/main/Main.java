package cts.main;

import cts.module.*;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        Pacient p1=new Pacient("Florescu","constient",new ArrayList<>());

        //cream modulele
        AbstractModulNotificare m1=new ModulNotificari();
        AbstractModulNotificare m2=new ModulProgramari();
        AbstractModulNotificare m3=new ModulAlertaMedic();
        // atasam modulele la pacient

        p1.adaugaModul(m1);
        p1.adaugaModul(m2);
        p1.adaugaModul(m3);

        //modificam starea si notificam

        p1.setStare("grava");
        p1.notificaModule();

        p1.setStare("in recuperare");
        p1.notificaModule();





    }
}
