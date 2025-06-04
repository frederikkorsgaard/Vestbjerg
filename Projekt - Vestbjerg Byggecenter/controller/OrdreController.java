package controller;
import model.*;
import java.util.ArrayList;

public class OrdreController {
    private static int nextOrderId = 1;
    private ProduktController produktController;
    private KundeController kundeController;
    private MedarbejderController medarbejderController;
    private OrdreContainer ordreContainer;
    private Ordre ordre;

    public OrdreController() {
        produktController = new ProduktController();
        kundeController = new KundeController();
        medarbejderController = new MedarbejderController();
        ordreContainer = OrdreContainer.getInstance();
    }

    public void opretOrdre() {
        ordre = new Ordre(nextOrderId++, null, null);
    }

    public void tilfoejKunde(int tlfNr) {
        PrivatKunde kunde = kundeController.findKunde(tlfNr);
        if (kunde != null && ordre != null) {
            ordre.setKunde(kunde);
        }
    }

    public void tilfoejMedarbejder(int medarbejderID) {
        Medarbejder medarbejder = medarbejderController.findMedarbejder(medarbejderID);
        if (medarbejder != null && ordre != null) {
            ordre.setMedarbejder(medarbejder);
        }
    }

    public void tilfoejProdukt(String navn, int antal) {
        AbstraktProdukt produkt = produktController.findProdukt(navn);
        if (produkt != null && ordre != null) {
            ordre.tilføjOrdreLinje(new OrdreLinje(produkt, antal));
        }
    }

    public void tilfoejProduktByBarcode(int barcode, int antal) {
        SimpelProdukt produkt = SimpelProduktContainer.getInstance().findProduktByBarcode(barcode);
        if (produkt != null && ordre != null) {
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
    
    public ArrayList<OrdreLinje> getOrdreLinjer() {
        return ordre != null ? ordre.getOrdreLinjer() : new ArrayList<>();
    }
}
