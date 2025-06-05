package ui;
import controller.OrdreController;
import controller.MedarbejderController;
import model.SimpelProdukt;
import model.SimpelProduktContainer;
import model.Medarbejder;
import model.OrdreLinje;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class OrdreUI {
    private OrdreController ordreController;
    private MedarbejderController medarbejderController;
    private Scanner scanner;
    private Medarbejder medarbejderLoggetInd;

    public OrdreUI() {
        ordreController = new OrdreController();
        medarbejderController = new MedarbejderController();
        scanner = new Scanner(System.in);
    }

    
    //Medarbejder Login
    public void medarbejderLogin(){
        System.out.println("=== Medarbejder Login ===");
        System.out.println("Tilgængelige medarbejdere:");
        System.out.println("ID: 1 - Frederik Korsgaard (Sælger)");
        System.out.println("ID: 2 - Jonathan Nicolai Dyndgaard (Sælger)");
        System.out.println("ID: 3 - Jakob Førby Pedersen (Sælger)");
        System.out.println("==========================");
        System.out.print("Indtast medarbejder ID: ");
        
        int medarbejderID = scanner.nextInt();
        Medarbejder medarbejder = medarbejderController.findMedarbejder(medarbejderID);
        
        if (medarbejder != null) {
            medarbejderLoggetInd = medarbejder;
            System.out.println("Login succesfuldt! Velkommen " + medarbejder.getNavn() + " (" + medarbejder.getRolle() + ")");
            System.out.println("===============================");
        } else {
            System.out.println("Medarbejder ikke fundet. Prøv igen.");
            medarbejderLogin(); 
        }
    }
    
    private void visTilgaengeligeProdukter() {
        System.out.println("=== Tilgængelige produkter ===");
        SimpelProduktContainer produktContainer = SimpelProduktContainer.getInstance();
        ArrayList<SimpelProdukt> produkter = produktContainer.getAlleProdukter();
        
        if (produkter.isEmpty()) {
            System.out.println("Ingen produkter tilgængelige.");
        } else {
            for (SimpelProdukt produkt : produkter) {
                System.out.println("- " + produkt.getBarcode() +"-"+ produkt.getNavn() + 
                                 " (" + produkt.getPris() + " DKK)" + 
                                 " - Lager: " + produkt.getLagerAntal());
            }
        }
        System.out.println("===============================");
    }
    
    private void visOrdrelinjer() {
        System.out.println("=== Ordre Oversigt ===");
        ArrayList<OrdreLinje> ordreLinjer = ordreController.getOrdreLinjer();
        
        if (ordreLinjer.isEmpty()) {
            System.out.println("Ingen produkter i ordren.");
        } else {
            System.out.println("Produkter i ordren:");
            for (OrdreLinje linje : ordreLinjer) {
                System.out.println("- " + linje.getProdukt().getNavn() + 
                                 " | Antal: " + linje.getAntal() + 
                                 " | Pris pr. stk: " + linje.getProdukt().getPris() + " DKK" +
                                 " | Subtotal: " + linje.getSubtotal() + " DKK");
            }
        }
    }
    
    public void RunSystem() {
        System.out.println("=== Velkommen til Vestbjerg Byggecenter ===");
        
        // Medarbejder login skal benyttes før der kan forsættes.
        medarbejderLogin();
        
        System.out.println("Kunder med telefonnumre 12345678 (Jens Jensen) og 87654321 (Jon Crispy)");
        System.out.println("============================================");
        
        // Opret ny ordre
        ordreController.opretOrdre();
        System.out.println("Ny ordre oprettet!");;
        System.out.println("===============================");
        
        // Tilføj kunde
        System.out.print("Indtast kundens telefonnummer: ");
        int tlfNr = scanner.nextInt();
        ordreController.tilføjKunde(tlfNr);
        System.out.println("Kunde tilføjet til ordre.");
        System.out.println("===============================");
        
        visTilgaengeligeProdukter();
        System.out.println("===============================");
        
        // Tilføj produkter
        boolean tilføjFlere = true;
        while (tilføjFlere) {
            System.out.print("Indtast produkt barcode: ");
            try {
            int barcode = scanner.nextInt();
            
            System.out.print("Indtast antal: ");
            int antal = scanner.nextInt();
            
            ordreController.tilføjProduktByBarcode(barcode, antal);
            System.out.println("Produkt med barcode '" + barcode + "' (antal: " + antal + ") tilføjet til ordre.");
            
            System.out.print("Vil du tilføje flere produkter? (ja/nej): ");
            String svar = scanner.next();
            tilføjFlere = svar.equalsIgnoreCase("ja");
            }catch(InputMismatchException e) {
                System.out.println("Fejl: Indtast KUN barcode.");
                scanner.nextLine(); // rydder den forkerte input
            }
        }
        
        visOrdrelinjer();
        
        // Vis total pris
        System.out.println("\nTotal pris: " + ordreController.getTotalPris() + " DKK");
        System.out.println("===============================");
        
        // Bekræft ordre
        System.out.print("Bekræft ordre? (ja/nej): ");
        String bekræft = scanner.next();
        if (bekræft.equalsIgnoreCase("ja")) {
            ordreController.bekræftOrdre();
            System.out.println("Ordre bekræftet og gemt!");
            System.out.println("===============================");
        } else {
            System.out.println("Ordre ikke bekræftet.");
            System.out.println("===============================");
        }
    }
    
    public void lukScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}