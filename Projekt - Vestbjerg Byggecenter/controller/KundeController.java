package controller;
import model.*;

public class KundeController {
    private KundeContainer kundeContainer;

    public KundeController() {
        kundeContainer = KundeContainer.getInstance();
    }

    public PrivatKunde findKunde(int tlfNr) {
        return kundeContainer.getTlfNr(tlfNr);
    }
}

