import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez n : ");
        int n = input.nextInt();

        System.out.println("La somme recursive de n est : " + somme(n));
        input.close();
    }

    static int somme(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n + somme(n - 1));
        }
    }

}
