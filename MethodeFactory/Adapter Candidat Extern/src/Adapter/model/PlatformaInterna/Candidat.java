package Adapter.model.PlatformaInterna;

public class Candidat implements AbstractCandidatPlatforma{
    private String nume;
    private int aniExperienta;
    private String[] competente;

    public Candidat(String nume, int aniExperienta, String[] competente) {
        this.nume = nume;
        this.aniExperienta = aniExperienta;
        this.competente = competente;
    }

    @Override
    public String obtineNume() {
        return nume;
    }

    @Override
    public int obtineAniExperienta() {
        return aniExperienta;
    }

    @Override
    public String[] obtineCompetente() {
        return competente;
    }
}
