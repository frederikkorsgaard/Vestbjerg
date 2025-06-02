package model;
import java.util.ArrayList;


public class MedarbejderContainer {
    private static MedarbejderContainer instance;
    private ArrayList<Medarbejder> medarbejdere;

    public static MedarbejderContainer getInstance() {
        if (instance == null) {
            instance = new MedarbejderContainer();
        }
        return instance;
    }

    public Medarbejder getID(int id) {
        return null; // implementering mangler
    }
}
