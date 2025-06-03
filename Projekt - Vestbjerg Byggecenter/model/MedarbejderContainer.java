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
        return null; // implementering mangler
    }
}
