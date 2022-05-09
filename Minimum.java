import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez trois nombres : ");
        double nb1 = input.nextDouble();
        double nb2 = input.nextDouble();
        double nb3 = input.nextDouble();
        double min2 = min2(nb1, nb2);
        double min3 = min3(nb3, min2(nb1, nb2));
        System.out.println("Le plus petit des deux premiers nombres est : " + min2);
        System.out.println("Le plus petit des trois nombres est : " + min3);

        input.close();

    }

    static double min2(double nb1, double nb2) {
        if (nb1 > nb2) {
            return nb2;
        }
        return nb1;
    }

    static double min3(double nb1, double nb2) {
        if (nb1 > nb2) {
            return nb2;
        }
        return nb1;
    }
}
