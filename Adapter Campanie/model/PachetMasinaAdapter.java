package adapter.model;

import adapter.model.proiectExistent.IPachet;
import adapter.model.proiectNou.IMasina;

public class PachetMasinaAdapter implements IPachet {

    private IMasina masina;

    public PachetMasinaAdapter(IMasina masina) {
        this.masina = masina;
    }

    @Override
    public void vindePachet() {
        masina.inchiriazaMasina();
    }
}
