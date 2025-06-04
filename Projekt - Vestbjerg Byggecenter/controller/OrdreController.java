package controller;
import model.*;

public class OrdreController {
    private ProduktController produktController;
    private KundeController kundeController;
    private MedarbejderController medarbejderController;
    private OrdreLinje ordreLinje;
    private OrdreContainer ordreContainer;
    private Ordre ordre;

    public OrdreController() {
        produktController = new ProduktController();
        kundeController = new KundeController();
        medarbejderController = new MedarbejderController();
        ordreContainer = OrdreContainer.getInstance();
    }

    public void opretOrdre() {
        ordre = new Ordre();
    }

    public void tilfoejKunde(int tlfNr) {
        PrivatKunde kunde = kundeController.findKunde(tlfNr);
        if (kunde != null) {
            ordre.setKunde(kunde);
        }
    }

    public void tilfoejProdukt(String navn, int antal) {
        Produkt produkt = produktController.findProdukt(navn);
        if (produkt != null) {
            ordre.tilføjOrdreLinje(new OrdreLinje(produkt, antal));
        }
    }

    public void tilfoejProduktByBarcode(int barcode, int antal) {
        SimpelProdukt produkt = SimpelProduktContainer.getInstance().findProduktByBarcode(barcode);
        if (produkt != null) {
            ordre.tilføjOrdreLinje(new OrdreLinje(produkt, antal));
        }
    }
    
    public void bekraeftOrdre() {
        if (ordre != null) {
            ordreContainer.tilføjOrdre(ordre);
        }
    }
    
    public double getTotalPris() {
        return ordre != null ? ordre.beregnTotalPris() : 0.0;
    }
}
