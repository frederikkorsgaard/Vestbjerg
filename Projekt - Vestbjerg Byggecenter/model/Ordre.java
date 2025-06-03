package model;
import java.util.ArrayList;
import java.util.Date;
class Ordre {
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
    this.status = "Åben";
    this.oprettetDato = new Date();
    this.ordreLinjer = new ArrayList<>();
    
}
public void tilføjOrdreLinje(OrdreLinje ordreLinje) {
    ordreLinjer.add(ordreLinje);
}
public double beregnTotalPris() {
    
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
}