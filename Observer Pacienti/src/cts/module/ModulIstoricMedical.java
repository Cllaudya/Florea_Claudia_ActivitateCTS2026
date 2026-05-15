package cts.module;

public class ModulIstoricMedical implements AbstractModulNotificare{
    @Override
    public void actualizeaza(String mesaj) {
        System.out.println("Modulul IstoricMedical a primit notificarea" +  mesaj);

    }
}
