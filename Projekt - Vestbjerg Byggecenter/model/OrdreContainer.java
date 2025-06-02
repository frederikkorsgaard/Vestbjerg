package model;
import java.util.ArrayList;


public class OrdreContainer {
    private static OrdreContainer instance;
    private ArrayList<Ordre> ordre;

    public static OrdreContainer getInstance() {
        if (instance == null) {
            instance = new OrdreContainer();
        }
        return instance;
    }

    public void tilfoejOrdre(Ordre o) {
        ordre.add(o);
    }
}
