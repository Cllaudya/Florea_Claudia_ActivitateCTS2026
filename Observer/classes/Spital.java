package Observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Ispital {
    private List<Pacient> listaPacienti =new ArrayList<>();


    public Spital(List<Pacient> listaPacienti) {
        this.listaPacienti = listaPacienti;
    }

    @Override
    public void notificaPacientii(String mesaj) {
        System.out.println("S-a receptionat mesajul " + mesaj);
        for(Pacient pacient: listaPacienti){
            pacient.receptioneazaNotificare(mesaj);
        }
    }

    @Override
    public void adaugaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }

    @Override
    public void stergePacient(Pacient pacient) {
        listaPacienti.remove(pacient);
    }

    public void notificaEpidemie(){
        notificaPacientii("A aparut o epidemie!");
    }

    public void notificaVirusi(){
        notificaPacientii("A aparut un virus!");
    }

}
