package model;

class Kopi extends UnikProdukt {
    private String produktNavn;
    private String tilstand;
    private int stelnummer;
    
    public Kopi(String navn, double pris, int stelnummer, String status,String produktNavn, String tilstand) {
        super(navn, pris, status);
        this.produktNavn = produktNavn;
        this.stelnummer = stelnummer;
        this.tilstand = tilstand;
    }
    
    public String getProduktNavn() {
        return produktNavn;
    }
    
    public int getStelnummer() {
        return stelnummer;
    }
    
    public String getTilstand() {
        return tilstand;
    }
}