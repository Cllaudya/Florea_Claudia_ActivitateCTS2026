package cts.Florea.Claudia.G1160.MethodeFactory.model;

public class ProdusElectronicFactory implements IFactory{
    @Override
    public IProdusGeneric createObject() {
        return new ProdusElectronic();
    }
}
