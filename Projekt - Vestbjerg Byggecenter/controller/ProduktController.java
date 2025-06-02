package controller;
import model.*;


public class ProduktController {
    private UnikProduktContainer unikProduktContainer;
    private SimpelProduktContainer simpelProduktContainer;

    public Produkt findProdukt(String navn) {
        // simplified selection logic
        return simpelProduktContainer.findProdukt(navn);
    }
}

