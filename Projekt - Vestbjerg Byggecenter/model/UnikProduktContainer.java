package model;
import java.util.ArrayList;


public class UnikProduktContainer {
    private static UnikProduktContainer instance;
    private ArrayList<UnikProdukt> unikkeProdukter;

    public static UnikProduktContainer getInstance() {
        if (instance == null) {
            instance = new UnikProduktContainer();
        }
        return instance;
    }

    public Kopi findKopi(String navn) {
        return null; // implementering mangler
    }
}
