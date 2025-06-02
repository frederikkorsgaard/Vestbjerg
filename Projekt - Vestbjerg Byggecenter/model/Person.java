package model;


class Person {
    private String fornavn;
    private String efternavn;
    private String email;
    private int tlfnr;
    private String adresse;
public Person(String fornavn, String efternavn, String email, int tlfnr, String adresse) {
this.fornavn = fornavn;
this.efternavn = efternavn;
this.email = email;
this.tlfnr = tlfnr;
this.adresse = adresse;
}
public String getNavn() {
    return fornavn + " " + efternavn;
}
public int getTlfnr() {
    return tlfnr;
}
}
