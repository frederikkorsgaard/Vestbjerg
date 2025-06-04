package model;


class OrdreLinje {
    private AbstraktProdukt produkt;
    private int antal;
    
    public OrdreLinje(AbstraktProdukt produkt, int antal) {
        this.produkt = produkt;
        this.antal = antal;
    }
    
    public double beregnSubtotal() {
        return produkt.getPris() * antal;
    }

    public AbstraktProdukt getProdukt() {
        return produkt;
    }

    public int getAntal() {
        return antal;
    }
}
