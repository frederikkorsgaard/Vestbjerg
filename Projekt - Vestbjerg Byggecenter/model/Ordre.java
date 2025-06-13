package model;
import java.util.ArrayList;
import java.util.Date;

public class Ordre {
    private int ordreID;
    private String status;
    private Date oprettetDato;
    private PrivatKunde privatKunde;
    private Medarbejder medarbejder;
    private ArrayList<OrdreLinje> ordreLinjer;
    
    public Ordre(int ordreID, PrivatKunde privatKunde, Medarbejder medarbejder) {
        this.ordreID = ordreID;
        this.privatKunde = privatKunde;
        this.medarbejder = medarbejder;
        this.status = "Oprettet";
        this.oprettetDato = new Date();
        this.ordreLinjer = new ArrayList<>();
    }
    
    public void tilføjOrdreLinje(OrdreLinje ordreLinje) {
        ordreLinjer.add(ordreLinje);
    }
    
    public double beregnTotalPris() {
        double total = 0;
        for (OrdreLinje linje : ordreLinjer) {
            total += linje.beregnSubtotal();
        }
        return total;
    }

    public int getOrdreID() {
        return ordreID;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public ArrayList<OrdreLinje> getOrdreLinjer() {
        return ordreLinjer;
    }
    
    public PrivatKunde getKunde() {
        return privatKunde;
    }
    
    public void setKunde(PrivatKunde kunde) {
        this.privatKunde = kunde;
    }
    
    public Medarbejder getMedarbejder() {
        return medarbejder;
    }
    
    public void setMedarbejder(Medarbejder medarbejder) {
        this.medarbejder = medarbejder;
    }
    
    public Date getOprettetDato() {
        return oprettetDato;
    }
}