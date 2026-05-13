package cts.Florea.Claudia.gNrGrupa.Chain.model;

public class FiltruParagrafe extends Filtru {
    @Override
    public void aplicaFiltru(PaginaWeb pagina) {
        // modifica setarile paragrafelor
        for(Item item : pagina.getItems()) {
            if(item.getTip().equals("paragraf")) {
                item.setSetari("culoare negru"); // ← modifica, nu elimina!
            }
        }

        // paseaza mai departe
        if(getUrmatorulFiltru() != null) {
            getUrmatorulFiltru().aplicaFiltru(pagina);
        }
    }

    }

