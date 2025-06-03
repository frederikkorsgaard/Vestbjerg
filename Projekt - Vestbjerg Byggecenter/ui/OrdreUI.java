package ui;
import controller.OrdreController;
import java.util.Scanner;

public class OrdreUI {
    private OrdreController ordreController;
    private Scanner scanner;

    public OrdreUI() {
        ordreController = new OrdreController();
        scanner = new Scanner(System.in);
    }

    public void opretOrdre() {
        ordreController.opretOrdre();
        System.out.println("Ny ordre oprettet!");
    }

    public void tilfoejKunde(int tlfNr) {
        ordreController.tilfoejKunde(tlfNr);
        System.out.println("Kunde tilføjet til ordre.");
    }

    public void tilfoejProdukt(String navn, int antal) {
        ordreController.tilfoejProdukt(navn, antal);
        System.out.println("Produkt '" + navn + "' (antal: " + antal + ") tilføjet til ordre.");
    }

    public void bekraeftOrdre() {
        ordreController.bekraeftOrdre();
        System.out.println("Ordre bekræftet og gemt!");
    }
    
    public double getTotalPris() {
        return ordreController.getTotalPris();
    }
    
    public void startInteraktivOrdre() {
        System.out.println("=== Velkommen til Vestbjerg Byggecenter ===");
        System.out.println("Tilgængelige produkter:");
        System.out.println("- Hammer (199.99 DKK)");
        System.out.println("- Skruetrækker (89.99 DKK)");
        System.out.println("- Sav (299.99 DKK)");
        System.out.println("- Unik Græsslåmaskine: Stelnummer: 9393939 (1599.99 DKK)");
        System.out.println("- Unik El-cykel: Stelnummer: 3939393 (11899.99 DKK)");
        System.out.println("============================================");
        
        // Opret ny ordre
        opretOrdre();
        
        // Tilføj kunde
        System.out.print("Indtast kundens telefonnummer: ");
        int tlfNr = scanner.nextInt();
        tilfoejKunde(tlfNr);
        
        // Tilføj produkter
        boolean tilfoejFlere = true;
        while (tilfoejFlere) {
            scanner.nextLine(); // Clear
            System.out.print("Indtast produktnavn: ");
            String produktNavn = scanner.nextLine();
            
            System.out.print("Indtast antal: ");
            int antal = scanner.nextInt();
            
            tilfoejProdukt(produktNavn, antal);
            
            System.out.print("Vil du tilføje flere produkter? (ja/nej): ");
            String svar = scanner.next();
            tilfoejFlere = svar.equalsIgnoreCase("ja") || svar.equalsIgnoreCase("ja");
        }
        
        // Vis total pris
        System.out.println("\nTotal pris: " + getTotalPris() + " DKK");
        
        // Bekræft ordre
        System.out.print("Bekræft ordre? (ja/nej): ");
        String bekraeft = scanner.next();
        if (bekraeft.equalsIgnoreCase("ja") || bekraeft.equalsIgnoreCase("ja")) {
            bekraeftOrdre();
        } else {
            System.out.println("Ordre ikke bekræftet.");
        }
    }
    
    public void lukScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}