import java.util.Scanner;

public class Moyenne2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entrez la 1ère note : ");
        double note1 = input.nextDouble();
        System.out.print("Entrez la 2ème note : ");
        double note2 = input.nextDouble();
        double moyenne = calcmoyenne(note1, note2);
        System.out.println("La moyenne des deux notes est : " + moyenne);

    }

    static double calcmoyenne(double a, double b) {
        return (a + b) / 2;
    }

}
