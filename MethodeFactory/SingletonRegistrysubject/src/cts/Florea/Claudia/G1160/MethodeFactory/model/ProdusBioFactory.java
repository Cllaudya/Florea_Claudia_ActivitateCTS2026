package cts.Florea.Claudia.G1160.MethodeFactory.model;

public class ProdusBioFactory implements IFactory {
    @Override
    public IProdusGeneric createObject() {
        return new ProdusBio();
    }
}
