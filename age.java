import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner donnee = new Scanner(System.in);
        int annee = 2021;
        int age;
        int naissance;
        System.out.println("Donnez votre age : ");
        age = donnee.nextInt();
        naissance = annee - age;
        System.out.println("Votre annee de naissance est : " + naissance);
        donnee.close();

    }

}
