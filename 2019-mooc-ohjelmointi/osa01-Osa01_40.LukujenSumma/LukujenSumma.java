
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int lukujenSumma = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }
            lukujenSumma += luku;
        }
        System.out.println("Lukujen summa " + lukujenSumma);
    }
}
