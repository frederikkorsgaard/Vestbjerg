package model;

class PrivatKunde extends Person {
    private String kundeID;

public PrivatKunde(String kundeID, String fornavn, String efternavn, String email, int tlfnr, String adresse) {
    super(fornavn, efternavn, email, tlfnr, adresse);
    this.kundeID = kundeID;
}
public String getKundeID() {
    return kundeID;
}
}
