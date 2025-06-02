package controller;
import model.*;


public class KundeController {
    private KundeContainer kundeContainer;

    public Kunde findKunde(int tlfNr) {
        return kundeContainer.getTlfNr(tlfNr);
    }
}
