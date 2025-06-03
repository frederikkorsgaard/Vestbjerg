package model;
import java.util.ArrayList;


public class SimpelProduktContainer {
    private static SimpelProduktContainer instance;
    private ArrayList<SimpelProdukt> simpleProdukter;

    private SimpelProduktContainer() {
        simpleProdukter = new ArrayList<>();
    }
    
    public void tilføjProdukt(SimpelProdukt p) {
         simpleProdukter.add(p);
     }
     
    public static SimpelProduktContainer getInstance() {
        if (instance == null) {
            instance = new SimpelProduktContainer();
        }
        return instance;
    }

    public SimpelProdukt findProdukt(String navn) {
        return null; // implementering mangler
    }
}
