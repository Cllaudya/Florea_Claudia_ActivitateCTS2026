package cts.Florea.Claudia.gNrGrupa.Chain.model;

public class FiltruImagini extends Filtru{
    @Override
    public void aplicaFiltru(PaginaWeb pagina) {
        // elimina imaginile
        pagina.getItems().removeIf(item -> item.getTip().equals("Imagine"));

        // paseaza mai departe
        if(getUrmatorulFiltru() != null) {
            getUrmatorulFiltru().aplicaFiltru(pagina);
        }
    }
}
