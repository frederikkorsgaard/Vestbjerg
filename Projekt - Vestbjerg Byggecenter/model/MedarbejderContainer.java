package model;
import java.util.ArrayList;
import java.util.List;


public class MedarbejderContainer {
    private static MedarbejderContainer instance;
    private ArrayList<Medarbejder> medarbejdere;

    private MedarbejderContainer() {
        medarbejdere = new ArrayList<>();
        // Tilføj testdata
        medarbejdere.add(new Medarbejder(1, "Sælger", "Frederik", "Korsgaard", "frederik.korsgaard@vestbjerg.dk", 12340001, "Nordbjergvej 1"));
        medarbejdere.add(new Medarbejder(2, "Sælger", "Jonathan", "Nicolai Dyndgaard", "jonathan.dyndgaard@vestbjerg.dk", 12340002, "Nordbjergvej 77"));
        medarbejdere.add(new Medarbejder(3, "Sælger", "Jakob", "Førby Pedersen", "jakob.pedersen@vestbjerg.dk", 12340003, "Nordbjergvej 31"));

    }
    
    public static MedarbejderContainer getInstance() {
        if (instance == null) {
            instance = new MedarbejderContainer();
        }
        return instance;
    }
    
    public void tilføjMedarbejder(Medarbejder medarbejder) {
        medarbejdere.add(medarbejder);
    }

    public Medarbejder findMedarbejder(int id) {
        int i = 0;
        while (i < medarbejdere.size()) {
            if (medarbejdere.get(i).getID() == id) return medarbejdere.get(i);
            i++;
        }
        return null;
    }
    
     public List<Medarbejder> getAlleMedarbejdere() {
        return new ArrayList<>(medarbejdere);
    }
}


