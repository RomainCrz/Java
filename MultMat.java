import java.util.Scanner;

public class MultMat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat1[][];
        int mat2[][];

        System.out.println("Saisi de la 1ère matrice : ");
        System.out.print("Nb lignes : ");
        int lignes1 = input.nextInt();
        System.out.print("Nb colonnes : ");
        int colonnes1 = input.nextInt();
        mat1 = new int[lignes1][colonnes1];

        for (int i = 0; i < lignes1; ++i) {
            for (int j = 0; j < colonnes1; ++j) {
                System.out.print("M[" + (i + 1) + "," + (j + 1) + "] = ");
                mat1[i][j] = input.nextInt();
            }
        }
        System.out.println("Saisi de la 2ème matrice : ");
        System.out.print("Nb lignes : ");
        int lignes2 = input.nextInt();
        System.out.print("Nb colonnes : ");
        int colonnes2 = input.nextInt();
        mat2 = new int[lignes2][colonnes2];

        for (int i = 0; i < lignes2; ++i) {
            for (int j = 0; j < colonnes2; ++j) {
                System.out.print("M[" + (i + 1) + "," + (j + 1) + "] = ");
                mat2[i][j] = input.nextInt();
            }
        }

        if (lignes2 != colonnes1) {
            System.out.println("Multiplication de matrices impossible !");
        } else {
            int mat3[][] = new int[lignes1][colonnes2];
            for (int i = 0; i < lignes1; ++i) {
                for (int j = 0; j < colonnes2; ++j) {
                    mat3[i][j] = 0;
                    for (int k = 0; k < colonnes1; ++k) {
                        mat3[i][j] += mat1[i][k] * mat2[k][j];
                    }
                    System.out.print(mat3[i][j] + " ");
                }
                System.out.println();
            }
        }

        input.close();

    }

}
