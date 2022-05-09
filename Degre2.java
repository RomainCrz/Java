import java.util.Scanner;

class Degre2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        while (a == 0.0) {
            System.out.print("Entrez une valeur non nulle pour a : ");
            a = input.nextDouble();
        }
        System.out.print("Entre une valeur pour b : ");
        b = input.nextDouble();
        System.out.print("Entre une valeur pour c : ");
        c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0.0) {
            System.out.println("Pas de solution reelle");
        } else if (delta == 0.0) {
            double solution = -b / (2 * a);
            System.out.println("Une solution unique : " + solution);
        } else {
            System.out.println("Deux solutions : "
                    + (-b - Math.sqrt(delta)) / (2 * a) + " et " + (-b + Math.sqrt(delta)) / (2 * a));
        }
        input.close();
    }

}
