package Composite.Model;

import java.util.ArrayList;
import java.util.List;

public class DepartamentComposite implements ISpital{

    private String denumireDepartament;
    List<ISpital> listaComposite = new ArrayList<>();

    public DepartamentComposite(String denumireDepartament) {
        this.denumireDepartament = denumireDepartament;
    }

    @Override
    public void adaugaNod(ISpital spital) {
        listaComposite.add(spital);
    }

    @Override
    public void getNod(int index) {
        listaComposite.get(index);
    }

    @Override
    public void stergeNod(ISpital spital) {
        listaComposite.remove(spital);
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent +"denumire " + denumireDepartament);
        for(ISpital element: listaComposite){
          element.descriere(indent+"->");
        }


    }


}
