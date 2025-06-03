package model;
import java.util.ArrayList;


public class KundeContainer {
    private static KundeContainer instance;
    private ArrayList<PrivatKunde> kunder;

    private KundeContainer() {
        kunder = new ArrayList<>();
    }
    public static KundeContainer getInstance() {
        if (instance == null) {
            instance = new KundeContainer();
        }
        return instance;
    }

    public PrivatKunde findKunde(int tlfNr) {
        return null; // implementering mangler
    }

    public void tilfoejKunde(PrivatKunde k) {
        kunder.add(k);
    }
}
