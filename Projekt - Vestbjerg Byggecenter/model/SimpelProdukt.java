package model;

public class SimpelProdukt extends AbstraktProdukt {
    private int lagerAntal;
    private int barcode;
    private static int nextBarcode = 1001;
    
    public SimpelProdukt(String navn, double pris, int lagerAntal){
        super(navn, pris);
        this.lagerAntal = lagerAntal;
        this.barcode = nextBarcode++;
    }
    
    public void reducerLager(int antal) {
        this.lagerAntal -= antal;
    }
    
    public int getLagerAntal() {
        return lagerAntal;
    }

    public int getBarcode() {
        return barcode;
    }
}