import models.Arbol;
import models.Rama;
import models.Tronco;

public class Main {
    public static void main(String[] args) {
        //TODO: Resuelve la siguiente problematica, Hay un arbol, este arbol tiene, tronco y ramas, a su vez cada rama
        // Puede contener mas ramas de manera infinita, En un rama en particular existe un pajaro, busca ese pajaro e
        // Indica la rama en la que se encuentra, el arbol tendra 3 ramas y cada rama 2 ramas más, el pajaro estara en la rama 2-2

        Test test = new Test();
        test.nombre
        Arbol arbol = new Arbol();
        System.out.println(arbol.id);
        System.out.println();
        System.out.println("tronco" + arbol.id);

        // Creacion Ramas Padres
        System.out.println("Creacion ramas Padre");
        Rama rama1 = new Rama();
        System.out.println(rama1.id);
        Rama rama2 = new Rama();
        System.out.println(rama2.id);
        Rama rama3 = new Rama();
        System.out.println(rama3.id);
        System.out.println();

        // sub ramas
        System.out.println("Sub ramas 1");
        rama1.subRamaList.add(new Rama());
        rama1.subRamaList.add(new Rama());
        System.out.println(rama1.subRamaList.get(0).id + " "  + rama1.subRamaList.get(1).id);
        System.out.println("Sub ramas 2");
        rama2.subRamaList.add(new Rama());
        rama2.subRamaList.add(new Rama());
        System.out.println(rama2.subRamaList.get(0).id + " "  +rama2.subRamaList.get(1).id);
        System.out.println("Sub ramas 3");
        rama3.subRamaList.add(new Rama());
        rama3.subRamaList.add(new Rama());
        System.out.println(rama3.subRamaList.get(0).id + " "  + rama3.subRamaList.get(1).id);
        System.out.println();
//        rama3.subRamaList.get(0).parajo.nombre = "Bird Loco";


        Rama ramaConPajaro = null;

        // Agregar ramas
        arbol.tronco.ramaList.add(rama1);
        arbol.tronco.ramaList.add(rama2);
        arbol.tronco.ramaList.add(rama3);

        arbol.tronco.ramaList.get(0).parajo.nombre = "Loco";

        for (int i = 0; i < arbol.tronco.ramaList.size(); i++) {
            ramaConPajaro = Rama.findBird(arbol.tronco.ramaList.get(i));
            if(ramaConPajaro != null){
                break;
            }

        }

        if(ramaConPajaro != null){
            System.out.println("Pájaro " + ramaConPajaro.parajo.nombre +
                " Encontrado en rama de id: " + ramaConPajaro.id);
        } else {
            System.out.println("No se encontró el pájaro");
        }

    }
}
