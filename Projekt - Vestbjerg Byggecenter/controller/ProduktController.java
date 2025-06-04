package controller;
import model.*;

public class ProduktController {
    private UnikProduktContainer unikProduktContainer;
    private SimpelProduktContainer simpelProduktContainer;

    public ProduktController() {
        unikProduktContainer = UnikProduktContainer.getInstance();
        simpelProduktContainer = SimpelProduktContainer.getInstance();
    }

    public Produkt findProdukt(String navn) {
        // First try to find simple product
        SimpelProdukt simpelProdukt = simpelProduktContainer.findProdukt(navn);
        if (simpelProdukt != null) {
            return simpelProdukt;
        }
        
        // If not found, try unique product (return as Kopi)
        Kopi kopi = unikProduktContainer.findKopi(navn);
        if (kopi != null) {
            // Create a wrapper or handle unique products differently
            return new SimpelProdukt(kopi.getNavn(), 0.0, 1); // Placeholder
        }
        
        return null;
    }
}

