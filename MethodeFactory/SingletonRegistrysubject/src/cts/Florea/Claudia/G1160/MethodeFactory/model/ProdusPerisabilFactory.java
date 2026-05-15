package cts.Florea.Claudia.G1160.MethodeFactory.model;

public class ProdusPerisabilFactory implements IFactory{
    @Override
    public IProdusGeneric createObject() {
        return new ProdusPerisabil();
    }
}
