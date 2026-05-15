package Command.main;

import Command.classes.*;

public class Main {

    public static void main(String[] args) {

        Pacient ipacient = new Pacient("Pacient 1", 30);
        Internare internare = new Internare(ipacient);
        Tratare tratare = new Tratare(ipacient);
        Operator operator = new Operator();
        operator.executa(internare);
        operator.executa(tratare);



    }


}
