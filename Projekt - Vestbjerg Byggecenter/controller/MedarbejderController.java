package controller;
import java.util.ArrayList;
import model.*;

public class MedarbejderController {
    private MedarbejderContainer medarbejderContainer;

    public MedarbejderController() {
        medarbejderContainer = MedarbejderContainer.getInstance();
    }

    public Medarbejder findMedarbejder(int medarbejderID) {
        return medarbejderContainer.getID(medarbejderID);
    }
}
