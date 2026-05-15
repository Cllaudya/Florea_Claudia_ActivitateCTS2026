package cts.Florea.Claudia.Grupa1160.MethodFactory.model;

public class CapotaFactory implements IFactoryComponenta {
    @Override
    public IComponenta creareComponenta(String culoare, String tipMaterial, boolean esteDetasabila) {
        return new Capota(culoare,tipMaterial,esteDetasabila);
    }
}
