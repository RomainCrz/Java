import java.util.Scanner;

public class Scalaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nMax = 10;
        double v1[] = new double[nMax];
        double v2[] = new double[nMax];
        int n;

        do {
            System.out.print("Entrez la taille des vecteurs : ");
            n = input.nextInt();
        } while (n < 1 && n > nMax);

        for (int i = 0; i < n; ++i) {
            System.out.print("Entrez la composante v1 " + i + " ");
            v1[i] = input.nextDouble();
        }
        for (int i = 0; i < n; ++i) {
            System.out.print("Entrez la composante v2 " + i + " ");
            v2[i] = input.nextDouble();
        }
        double produit = 0;
        for (int i = 0; i <= n; ++i) {
            produit = produit + v1[i] * v2[i];
        }
        System.out.println("Le produit scalaire de v1 par v2 est : " + produit);
        input.close();
    }
}
