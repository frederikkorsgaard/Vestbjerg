package model;
import java.util.ArrayList;

public class OrdreContainer {
    private static OrdreContainer instance;
    private ArrayList<Ordre> ordre;

    private OrdreContainer () {
        ordre = new ArrayList<>();
    }
    
    public static OrdreContainer getInstance() {
        if (instance == null) {
            instance = new OrdreContainer();
        }
        return instance;
    }

    public void tilfoejOrdre(Ordre o) {
        ordre.add(o);
    }
    
    public Ordre findOrdre(int ordreID) {
        for (Ordre o : ordre) {
            if (o.getOrdreID() == ordreID) {
                return o;
            }
        }
        return null;
    }
}
