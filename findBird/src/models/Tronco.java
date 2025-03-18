package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Tronco {
    public String id = UUID.randomUUID().toString();
    public List<Rama> ramaList = new ArrayList<>();
}
