package model;

class SimpelProdukt extends AbstraktProdukt {
    private int lagerAntal;
    
    public SimpelProdukt(String navn, double pris, int lagerAntal){
        super(navn, pris);
        this.lagerAntal = lagerAntal;
    }
    public void reducerLager(int antal) {
        this.lagerAntal -= antal;
    }
    public int getLagerAntal() {
        return lagerAntal;
    }
}