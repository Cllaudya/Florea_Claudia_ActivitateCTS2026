package cts.Florea.Claudia.Grupa1160.MethodFactory.model;

public class BaraFactory implements IFactoryComponenta {
    @Override
    public IComponenta creareComponenta(String culoare, String tipMaterial, boolean esteDetasabila) {
        return new Bara(culoare,tipMaterial,esteDetasabila);
    }
}
