package Spital.adapter.main;

import Spital.adapter.FarmacieAdapter;
import Spital.adapter.proiectFarmacie.ImedicamentFarmacie;
import Spital.adapter.proiectFarmacie.MedicamentFarmacie;
import Spital.adapter.proiectSpital.Imedicament;
import Spital.adapter.proiectSpital.Medicament;

public class Main {


    public static void main(String[] args){
        ImedicamentFarmacie medFarm = new MedicamentFarmacie("Nurofen", 20.2f, false);
        medFarm.cumparaMedicament();
        Imedicament medSpital = new Medicament("Alg", 15.0f);
        medSpital.achizitionezaMedicament();
        ImedicamentFarmacie medFarmAdaptat = new FarmacieAdapter(medSpital);
        medFarmAdaptat.cumparaMedicament();


    }
}
