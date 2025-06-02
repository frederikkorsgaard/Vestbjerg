package controller;


public class MedarbejderController {
    private MedarbejderContainer medarbejderContainer;

    public Medarbejder findMedarbejder(int medarbejderID) {
        return medarbejderContainer.getID(medarbejderID);
    }
}
