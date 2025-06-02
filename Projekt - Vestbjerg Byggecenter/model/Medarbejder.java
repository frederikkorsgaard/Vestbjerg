package model;

class Medarbejder extends Person {
    private int medarbejderID;
    private String rolle;
    
public Medarbejder(int medarbejderID, String rolle, String fornavn, String efternavn, String email, int tlfnr, String adresse) {
    super(fornavn, efternavn, email, tlfnr, adresse);
    this.medarbejderID = medarbejderID;
    this.rolle = rolle;
}
public int getID() {
    return medarbejderID;
}
public String getRolle() {
    return rolle;
}
}
