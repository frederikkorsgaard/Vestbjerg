package ui;

public class OrdreUI {
    private OrdreController ordreController;

    public OrdreUI() {
        ordreController = new OrdreController();
    }

    public void opretOrdre() {
        ordreController.opretOrdre();
    }

    public void tilfoejKunde(int tlfNr) {
        ordreController.tilfoejKunde(tlfNr);
    }

    public void tilfoejProdukt(String navn, int antal) {
        ordreController.tilfoejProdukt(navn, antal);
    }

    public void bekraeftOrdre() {
        ordreController.bekraeftOrdre();
    }
}
