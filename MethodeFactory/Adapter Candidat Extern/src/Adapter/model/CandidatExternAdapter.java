package Adapter.model;

import Adapter.model.PlatformaInterna.AbstractCandidatPlatforma;
import Adapter.model.SistemExtern.CVExtern;

public class CandidatExternAdapter implements AbstractCandidatPlatforma {

    private CVExtern cvExtern;

    public CandidatExternAdapter(CVExtern cvExtern) {
        this.cvExtern=cvExtern;
    }

    @Override
    public String obtineNume() {
        return cvExtern.getNumePrenume();
    }

    @Override
    public int obtineAniExperienta() {
        return cvExtern.getVechime();
    }

    @Override
    public String[] obtineCompetente() {
        return cvExtern.getSkills();
    }
}
