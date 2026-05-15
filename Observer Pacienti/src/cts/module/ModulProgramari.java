package cts.module;

public class ModulProgramari implements AbstractModulNotificare {
    @Override
    public void actualizeaza(String mesaj) {
        System.out.println("Modulul Programari a primit notificarea"+mesaj);

    }
}
