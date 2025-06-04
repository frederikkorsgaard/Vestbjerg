package model;
import java.util.*;

public abstract class AbstraktProdukt {
    private String navn;
    private double pris;

public AbstraktProdukt (String navn, double pris) {
    this.navn = navn;
    this.pris = pris;
}
public String getNavn() {
    return navn;
}
public double getPris() {
    return pris;
}
}
