package model;
import java.util.ArrayList;


public class UnikProduktContainer {
    private static UnikProduktContainer instance;
    private ArrayList<UnikProdukt> unikkeProdukter;

    private UnikProduktContainer() {
        unikkeProdukter = new ArrayList<>();
    }
    
    public static UnikProduktContainer getInstance() {
        if (instance == null) {
            instance = new UnikProduktContainer();
        }
        return instance;
    }

    public void tilføjProdukt(UnikProdukt p) {
        unikkeProdukter.add(p);
    }
    
    public Kopi findKopi(String navn) {
        return null; // implementering mangler
    }
}
