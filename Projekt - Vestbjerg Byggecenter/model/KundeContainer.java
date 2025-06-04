package model;
import java.util.ArrayList;
import java.util.List;

public class KundeContainer {
    private static KundeContainer instance;
    private ArrayList<PrivatKunde> kunder;

    private KundeContainer() {
        kunder = new ArrayList<>();
        // Test data
        kunder.add(new PrivatKunde("K001", "Jens", "Jensen", "jens.jensen@email.dk", 12345678, "Vestergade 12"));
        kunder.add(new PrivatKunde("K002", "Jon", "Crispy", "jon.crispy@email.dk", 87654321, "Østergade 5"));
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

    public PrivatKunde getTlfNr(int tlf) {
        return findKunde(tlf);
    }
    
    public void tilføjKunde(PrivatKunde k) {
        kunder.add(k);
    }
    
     public List<PrivatKunde> getAlleKunder() {
        return new ArrayList<>(kunder);
    }
}
