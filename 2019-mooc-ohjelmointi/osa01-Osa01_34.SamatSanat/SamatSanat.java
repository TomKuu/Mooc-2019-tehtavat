
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen merkkijono:");
        String ekaMerkkiJono = lukija.nextLine();
        
        System.out.println("Syötä toinen merkkijono:");
        String tokaMerkkiJono = lukija.nextLine();
        
        if (ekaMerkkiJono.equals(tokaMerkkiJono)) {
            System.out.println("Samat sanat");
        } else {
            System.out.println("Ei sitten");
        }
    }
}
