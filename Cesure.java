import java.util.Scanner;
import java.util.ArrayList;

public class Cesure {
    public static void main(String[] args) {
        String[] phrase = lirePhrase();
        for (int i = 0; i < phrase.length; i++) {
            cesure(phrase[i]);
        }
    }

    static String[] lirePhrase() {
        // A compléter:
        // retourne un tableau de chaines de caractères
        // introduits par l'utilisateur
        Scanner input = new Scanner(System.in);
        int nbMots = 0;
        do {
            System.out.print("Donnez le nombre de mots dans votre phrase : ");
            nbMots = input.nextInt();
            System.out.println("Entrez une valeur plus grande que 0");
        } while (nbMots == 0);
        String[] cesure = new String[nbMots];
        for (int i = 0; i < nbMots; i++) {
            System.out.print("Donnez le mot " + (i + 1) + " : ");
            cesure[i] = input.next();
        }
        input.close();
        return cesure;
    }

    static boolean voyelle(char c) {
        // A compléter:
        // teste si un caractère est une voyelle
        char[] voyelle = { 'a', 'e', 'i', 'o', 'u', 'y' };
        boolean isVoyelle = false;
        for (int i = 0; i < voyelle.length; i++) {
            if (c == voyelle[i]) {
                isVoyelle = true;
            }
        }
        return isVoyelle;
    }

    // static boolean queVoyelles(String s) {
    // // A compléter:
    // // teste si une chaîne ne contient que des voyelles
    // // utilise la méthode voyelle

    // }

    static void cesure(String mot) {
        // A compléter:
        // détermine la césure d'un mot donné et effectue les affichages
        // correspondants (voir exemple de déroulement)
        ArrayList<String> mot2 = new ArrayList<String>();
        int compteur = 0;
        String s = "";
        for (int i = 0; i < mot.length(); ++i) {
            char c = mot.charAt(i);
            String convert = String.valueOf(c);
            if (s == "") {
                mot2.add(s);
            }
            if (voyelle(mot.charAt(i)) && i < mot.length() - 2) {
                s = s + convert;
                if (i != 0 && !voyelle(mot.charAt(i + 1))) {
                    s = s + "-";
                    mot2.set(compteur, s);
                    System.out.println(mot2.get(compteur));
                    ++compteur;
                    s = "";
                }

            } else {
                s = s + convert;
                // if (i != 0 && s.length() == 1) {
                // s = mot2.get(compteur - 1) + s;
                // mot2.set(compteur - 1, s);
                // }
                mot2.set(compteur, s);
                if (i == mot.length() - 1) {
                    System.out.println(mot2.get(compteur));
                }
            }
        }
    }

}
