package model;
import java.util.ArrayList;
import java.util.List;

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

    public PrivatKunde findKunde(int tlf) {
        int i = 0;
        while (i < kunder.size()) {
            if (kunder.get(i).getTlfnr() == tlf) return kunder.get(i);
            i++;
        }
        return null;
    }

    public void tilfoejKunde(PrivatKunde k) {
        kunder.add(k);
    }
    
     public List<PrivatKunde> getAlleKunder() {
        return new ArrayList<>(kunder);
    }
}
