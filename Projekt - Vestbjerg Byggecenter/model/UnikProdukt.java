package model;

class UnikProdukt extends AbstraktProdukt {
    private int stelnummer;
    private String status;

    public UnikProdukt(String navn, double pris, int stelnummer, String status) {
        super(navn, pris);
        this.stelnummer = stelnummer;
        this.status = status;
    }

    public int getStelnummer() {
        return stelnummer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}