import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nbre;
        System.out.print("Donnez le nombre d'étudiants : ");
        nbre = input.nextInt();

        double moyenne = 0;
        double notes[] = new double[nbre];

        for (int i = 0; i < nbre; ++i) {
            System.out.print("Entre la notre de l'élève " + (i + 1) + " : ");
            notes[i] = input.nextDouble();
            moyenne = moyenne + notes[i];
        }
        moyenne = moyenne / nbre;
        System.out.println("La moyenne du contrôle est de : " + moyenne);

        for (int i = 0; i < nbre; ++i) {
            double ecart = notes[i] - moyenne;
            System.out.println("L'écart à la moyenne de l'élève " + (i + 1) + " est de : " + ecart);
        }
        input.close();
    }
}
