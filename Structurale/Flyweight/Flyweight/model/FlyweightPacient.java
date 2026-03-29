package Flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPacient {

    Map<String ,Pacient > mapPacient = new HashMap<>();
    public Pacient getPacient(String numePacient, String numarTelefon, String adresa){
        if(!mapPacient.containsKey(numePacient)){
            Pacient pacient = new Pacient(numePacient, numarTelefon, adresa);
            mapPacient.put(numePacient,pacient);
        }

        return mapPacient.get(numePacient);
    }


}
