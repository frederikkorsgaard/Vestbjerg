package model;
import java.util.ArrayList;


public class MedarbejderContainer {
    private static MedarbejderContainer instance;
    private ArrayList<Medarbejder> medarbejdere;

    private MedarbejderContainer() {
        medarbejdere = new ArrayList<>();
    }
    
    public static MedarbejderContainer getInstance() {
        if (instance == null) {
            instance = new MedarbejderContainer();
        }
        return instance;
    }
    
    public void tilføjMedarbejder(Medarbejder m) {
        medarbejdere.add(m);
    }

    public Medarbejder findMedarbejder(int id) {
        int i = 0;
        while (i < medarbejdere.size()) {
            if (medarbejdere.get(i).getID() == id) return medarbejdere.get(i);
            i++;
        }
        return null;
    }
}

