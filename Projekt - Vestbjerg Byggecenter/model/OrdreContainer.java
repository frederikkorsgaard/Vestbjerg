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

    public void tilføjOrdre(Ordre o) {
        ordre.add(o);
    }
    
    public Ordre findOrdre(int ordreID) {
        int i = 0;
            while (i < ordre.size()) {
                if (ordre.get(i).getOrdreID() == ordreID) 
                return ordre.get(i);
                i++;
        }
        return null;
    }
}
