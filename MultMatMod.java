import java.util.Scanner;

public class MultMatMod {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] mat1 = lireMatrice();
        double[][] mat2 = lireMatrice();
        System.out.println(mat1.length + " " + mat2[0].length);
        if (mat1[0].length != mat2.length) {
            System.out.println("Multiplication de matrices impossible !");
        } else {
            double[][] prod = multiplierMatrice(mat1, mat2);
            System.out.println("Résultat :");
            afficherMatrice(prod);
        }
    }

    static double[][] lireMatrice() {
        double mat[][];

        System.out.println("Saisi de la matrice : ");
        System.out.print("Nb lignes : ");
        int lignes = input.nextInt();
        System.out.print("Nb colonnes : ");
        int colonnes = input.nextInt();
        mat = new double[lignes][colonnes];

        for (int i = 0; i < lignes; ++i) {
            for (int j = 0; j < colonnes; ++j) {
                System.out.print("M[" + (i + 1) + "," + (j + 1) + "] = ");
                mat[i][j] = input.nextDouble();
            }
        }
        return mat;
    }

    static double[][] multiplierMatrice(double[][] mat1, double[][] mat2) {
        double mat3[][] = new double[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; ++i) {
            for (int j = 0; j < mat2[0].length; ++j) {
                mat3[i][j] = 0;
                for (int k = 0; k < mat1[0].length; ++k) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }

        }
        return mat3;

    }

    static void afficherMatrice(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; ++j) {
                System.out.print((int) mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
