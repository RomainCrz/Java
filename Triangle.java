import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez la taille du triangle : ");
        int taille = input.nextInt();
        int colonnes = 1;

        int pascal[][] = new int[taille][taille];
        pascal[0][0] = 1;
        System.out.println(pascal[0][0] + " ");

        for (int i = 1; i < taille; i++) {
            ++colonnes;
            for (int j = 0; j < colonnes; j++) {
                if (j - 1 < 0) {
                    pascal[i][j] = pascal[(i - 1)][j];
                    System.out.print(pascal[i][j] + " ");
                } else {
                    pascal[i][j] = pascal[(i - 1)][j] + pascal[(i - 1)][(j - 1)];
                    System.out.print(pascal[i][j] + " ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
