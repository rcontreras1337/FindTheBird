package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Rama {
    public String id = UUID.randomUUID().toString();
    public List<Rama> subRamaList = new ArrayList<>();
    public Pajaro pajaro;

    public static Rama econtrarPajaro(Rama rama) {
        if (rama.pajaro != null) {
            return rama;
        }
        for (Rama subRama : rama.subRamaList) {
            Rama resultado = econtrarPajaro(subRama);
            if (resultado != null) {
                return resultado;
            }
        }
        return null;
    }
}

