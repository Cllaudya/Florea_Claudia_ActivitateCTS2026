package adapter.main;

import adapter.model.PachetMasinaAdapter;
import adapter.model.proiectExistent.IPachet;
import adapter.model.proiectExistent.Pachet;
import adapter.model.proiectNou.IMasina;
import adapter.model.proiectNou.Masina;

public class Main {

    public static void main(String[] args) {
        IPachet pachet = new Pachet("Roma",500,3);
        pachet.vindePachet();

        IMasina masina = new Masina("Audi",30000,"rosu");
        masina.inchiriazaMasina();


        System.out.println("Apel dupa ce am adaptat");
        IPachet pachetAdaptat = new PachetMasinaAdapter(masina);
        pachetAdaptat.vindePachet();
    }
}
