package controller;
import model.*;


class OrdreController {
    private OrdreContainer ordreContainer = OrdreContainer.getInstance();
    private KundeContainer kundeContainer = KundeContainer.getInstance();
    private MedarbejderContainer medarbejderContainer = MedarbejderContainer.getInstance();

    public Ordre opretOrdre(int ordreID, int kundeTlf, int medarbejderID) {
        PrivatKunde kunde = kundeContainer.findKunde(kundeTlf);
        Medarbejder medarbejder = medarbejderContainer.findMedarbejder(medarbejderID);
        if (kunde == null || medarbejder == null) return null;

        Ordre ordre = new Ordre(ordreID, kunde, medarbejder);
        ordreContainer.tilføjOrdre(ordre);
        return ordre;
    }

    public void tilføjOrdreLinje(int ordreID, AbstraktProdukt produkt, int antal) {
        Ordre ordre = ordreContainer.findOrdre(ordreID);
        if (ordre != null) {
            OrdreLinje linje = new OrdreLinje(produkt, antal);
            ordre.tilføjOrdreLinje(linje);
        }
    }

    public double beregnPris(int ordreID) {
        Ordre ordre = ordreContainer.findOrdre(ordreID);
        if (ordre != null) return ordre.beregnTotalPris();
        return 0;
    }
}
