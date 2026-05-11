package cts.Florea.Claudia.g1160.Observer.model;

public class Administrator implements Observer {
    private String nume;
    public Administrator(String nume) {
        this.nume=nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(nume + "a primit notificarea" + mesaj);

    }
}
