package cts.module;

public class ModulNotificari implements AbstractModulNotificare{
    @Override
    public void actualizeaza(String mesaj) {
        System.out.println("Modulul Notificari a primit notificarea" + mesaj);

    }
}
