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
        for (PrivatKunde k : kunder) {
            if (k.getTlfnr() == tlfNr) 
            return k;
        }
        return null; 
    }

    public void tilfoejKunde(PrivatKunde k) {
        kunder.add(k);
    }
}
