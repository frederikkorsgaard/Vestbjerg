package model;

class Kopi extends UnikProdukt {
    private String produktNavn;
    private String tilstand;
    
    public Kopi(String navn, double pris, int stelnummer, String status,String produktNavn, String tilstand) {
        super(navn, pris, stelnummer, status);
        this.produktNavn = produktNavn;
        this.tilstand = tilstand;
    }
    
    public String getProduktNavn() {
        return produktNavn;
    }
    
    public String getTilstand() {
        return tilstand;
    }
}