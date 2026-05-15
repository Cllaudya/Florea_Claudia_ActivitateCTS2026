package cts.Florea.Claudia.g1160.Observer.model;

public interface Subject {
    public void adaugaObserver (Observer observer);
    public void stergeObserver (Observer observer);
    public void trimiteNotificare (String mesaj);
}
