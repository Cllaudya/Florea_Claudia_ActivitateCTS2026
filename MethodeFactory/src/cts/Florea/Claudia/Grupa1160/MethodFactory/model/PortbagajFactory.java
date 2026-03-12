package cts.Florea.Claudia.Grupa1160.MethodFactory.model;

public class PortbagajFactory implements IFactoryComponenta{
    @Override
    public IComponenta creareComponenta(String culoare, String tipMaterial, boolean esteDetasabila) {
        return new Portbagaj(culoare,tipMaterial,esteDetasabila);
    }
}
