package models;

import java.util.UUID;

public class Arbol {
    public String id = "ID=Arbol-"+UUID.randomUUID().toString();
    public Tronco tronco = new Tronco();
}
