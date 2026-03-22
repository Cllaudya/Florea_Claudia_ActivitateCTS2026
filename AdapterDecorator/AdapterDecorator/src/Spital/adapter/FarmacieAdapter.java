package Spital.adapter;

import Spital.adapter.proiectFarmacie.ImedicamentFarmacie;
import Spital.adapter.proiectSpital.Imedicament;
import Spital.adapter.proiectSpital.Medicament;

public class FarmacieAdapter implements ImedicamentFarmacie {

    private Imedicament medicamentSpital;

    public FarmacieAdapter(Imedicament medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
       medicamentSpital.achizitionezaMedicament();
    }
}
