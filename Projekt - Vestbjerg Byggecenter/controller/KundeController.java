package controller;
import model.*;

class KundeController {
    private KundeContainer kundeContainer = KundeContainer.getInstance();

    public void tilføjKunde(PrivatKunde k) {
        kundeContainer.tilføjKunde(k);
    }

    public PrivatKunde findKunde(int tlf) {
        return kundeContainer.findKunde(tlf);
    }
}

