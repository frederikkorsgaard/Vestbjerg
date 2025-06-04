package model;

public class UnikProdukt extends AbstraktProdukt {
    private String status;

    public UnikProdukt(String navn, double pris, String status) {
        super(navn, pris);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}