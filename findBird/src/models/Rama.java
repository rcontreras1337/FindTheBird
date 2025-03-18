package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Rama {
    public String id = "ID=rama-"+UUID.randomUUID().toString();
    public List<Rama> subRamaList = new ArrayList<>();
    public Parajo parajo = new Parajo();

    public static Rama findBird(Rama rama) {
       // Validamos que el pájaro exista en la rama padre
        if(rama.parajo.nombre != null) {
            return rama;
        }
        for(Rama subRama : rama.subRamaList) {
            Rama resultado = findBird(subRama);
            if(resultado != null) {
                return resultado;
            }
        }
        return null;
    }
}
