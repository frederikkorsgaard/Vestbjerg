package controller;
import java.util.ArrayList;
import model.*;


class MedarbejderController {
    private MedarbejderContainer medarbejderContainer = MedarbejderContainer.getInstance();

    public void tilføjMedarbejder(Medarbejder m) {
        medarbejderContainer.tilføjMedarbejder(m);
    }

    public Medarbejder findMedarbejder(int id) {
        return medarbejderContainer.findMedarbejder(id);
    }
}
