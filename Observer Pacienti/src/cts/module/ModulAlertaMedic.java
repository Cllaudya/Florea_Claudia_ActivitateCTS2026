package cts.module;

public class ModulAlertaMedic implements AbstractModulNotificare{
    @Override
    public void actualizeaza(String mesaj) {
        System.out.println("Modulul AlertaMedic a primit notificarea" + mesaj);

    }
}
