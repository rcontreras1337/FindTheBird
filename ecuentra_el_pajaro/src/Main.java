import models.Arbol;
import models.Pajaro;
import models.Rama;
import models.Tronco;

import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        System.out.println( "Arbol id = " + arbol.id);
        arbol.tronco = new Tronco();
        System.out.println( "Arbol tronco = " + arbol.tronco);
        // Ramas Padres
        Rama rama1 = new Rama();
        Rama rama2 = new Rama();
        Rama rama3 = new Rama();

        System.out.println( "Rama 1 = " + rama1.id);
        System.out.println( "Rama 2 = " + rama2.id);
        System.out.println( "Rama 3 = " + rama3.id);
        System.out.println();
        // Sub ramas
        rama1.subRamaList.add(new Rama());
        rama1.subRamaList.add(new Rama());
        System.out.println("subRamaList1 = " + rama1.subRamaList.get(0).id);
        System.out.println("subRamaList1 = " + rama1.subRamaList.get(1).id);
        System.out.println();
        rama2.subRamaList.add(new Rama());
        rama2.subRamaList.add(new Rama());
        System.out.println("subRamaList2 = " + rama2.subRamaList.get(0).id);
        System.out.println("subRamaList2 = " + rama2.subRamaList.get(1).id);
        rama2.subRamaList.get(1).pajaro = new Pajaro();
        rama2.subRamaList.get(1).pajaro.nombre = "Pajaro Loco";
        System.out.println();
        rama3.subRamaList.add(new Rama());
        rama3.subRamaList.add(new Rama());
        System.out.println("subRamaList3 = " + rama3.subRamaList.get(0).id);
        System.out.println("subRamaList3 = " + rama3.subRamaList.get(1).id);
        System.out.println();
        // Pajaro
        Pajaro pajaro = new Pajaro();
        pajaro.nombre = "Pajaro";

        // ramas a tronco
        arbol.tronco.ramaList.add(rama1);
        arbol.tronco.ramaList.add(rama2);
        arbol.tronco.ramaList.add(rama3);

        Rama ramaConPajaro = null;
        for (int i = 0; i < arbol.tronco.ramaList.size(); i++) {
            ramaConPajaro = Rama.econtrarPajaro(arbol.tronco.ramaList.get(i));
            if( ramaConPajaro != null ) {
                break;
            }
        }

        if (ramaConPajaro != null) {
            System.out.println("Se encontro pajaro en rama" + ramaConPajaro.id);
        } else {
            System.out.println("No se encontro pajaro en rama");
        }

    }
}
