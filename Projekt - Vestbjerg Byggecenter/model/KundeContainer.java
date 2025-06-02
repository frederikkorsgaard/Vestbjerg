package model;
import java.util.ArrayList;


public class KundeContainer {
    private static KundeContainer instance;
    private ArrayList<PrivatKunde> kunder;

    public static KundeContainer getInstance() {
        if (instance == null) {
            instance = new KundeContainer();
        }
        return instance;
    }

    public PrivatKunde getTlfNr(int tlfNr) {
        return null; // implementering mangler
    }

    public void tilfoejKunde(Kunde k) {
        kunder.add((PrivatKunde) k);
    }
}
