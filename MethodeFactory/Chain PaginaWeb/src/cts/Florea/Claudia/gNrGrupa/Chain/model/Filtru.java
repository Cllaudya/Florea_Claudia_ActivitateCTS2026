package cts.Florea.Claudia.gNrGrupa.Chain.model;

public abstract class Filtru {
    private Filtru urmatorulFiltru;

    public Filtru getUrmatorulFiltru() {
        return urmatorulFiltru;
    }

    public void setUrmatorulFiltru(Filtru urmatorulFiltru) {
        this.urmatorulFiltru = urmatorulFiltru;
    }

    public abstract void aplicaFiltru(PaginaWeb pagina);

}
