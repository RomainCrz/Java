
import java.util.Scanner;

public class etoile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Combien de lignes : ");
        int lignes = input.nextInt();

        for (int j = 1; j <= lignes; ++j) {
            System.out.println(" ");
            for (int i = 1; i <= lignes - j; ++i) {
                System.out.print(" ");
            }

            for (int i = 0; i < j * 2 - 1; i++) {
                System.out.print("*");
            }
        }
        input.close();
    }
}
