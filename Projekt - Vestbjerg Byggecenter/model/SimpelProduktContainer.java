package model;
import java.util.ArrayList;

public class SimpelProduktContainer {
    private static SimpelProduktContainer instance;
    private ArrayList<SimpelProdukt> simpleProdukter;

    private SimpelProduktContainer() {
        simpleProdukter = new ArrayList<>();
        // Tilføj produkter - Navn, pris, antal på lager
        simpleProdukter.add(new SimpelProdukt("Hammer", 199.99, 50));
        simpleProdukter.add(new SimpelProdukt("Skruetrækker", 89.99, 100));
        simpleProdukter.add(new SimpelProdukt("Sav", 299.99, 25));
        simpleProdukter.add(new SimpelProdukt("Svensknøgle", 149.99, 70));
        simpleProdukter.add(new SimpelProdukt("Unbrakonøglesæt", 99.99, 150));
        simpleProdukter.add(new SimpelProdukt("Knibtang", 89.99, 60));
        simpleProdukter.add(new SimpelProdukt("Vaterpas", 49.99, 83));
        simpleProdukter.add(new SimpelProdukt("Hobbykniv", 39.99, 137));
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
        int i = 0;
        while (i < simpleProdukter.size()) {
            if (simpleProdukter.get(i).getNavn().equalsIgnoreCase(navn)) {
                return simpleProdukter.get(i);
            }
            i++;
        }
        return null;
    }
    // Find produkt udfra barcode
    public SimpelProdukt findProduktByBarcode(int barcode) {
        int i = 0;
        while (i < simpleProdukter.size()) {
            if (simpleProdukter.get(i).getBarcode() == barcode) {
                return simpleProdukter.get(i);
            }
            i++;
        }
        return null;
    }

    // Find alle produkter
    public ArrayList<SimpelProdukt> getAlleProdukter() {
        return new ArrayList<>(simpleProdukter);
    }
}
