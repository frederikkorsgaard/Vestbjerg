package controller;

public class OrdreController {
    private ProduktController produktController;
    private KundeController kundeController;
    private MedarbejderController medarbejderController;
    private OrdreLinje ordreLinje;
    private OrdreContainer ordreContainer;
    private Ordre ordre;

    public void opretOrdre() {
        ordre = new Ordre();
    }

    public void tilfoejKunde(int tlfNr) {
        Kunde kunde = kundeController.findKunde(tlfNr);
        ordre.setKunde(kunde);
    }

    public void tilfoejProdukt(String navn, int antal) {
        Produkt produkt = produktController.findProdukt(navn);
        ordre.tilfoejOrdrelinje(new OrdreLinje(produkt, antal));
    }

    public void bekraeftOrdre() {
        ordreContainer.tilfoejOrdre(ordre);
    }
}
