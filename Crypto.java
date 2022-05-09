import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            boolean bool1 = Character.isLetter(c1);
            boolean bool2 = Character.isSpaceChar(c1);
            boolean bool3 = Character.isLowerCase(c1);
            if ((bool1 && bool3) || bool2) {
                aCoder = aCoder + c1;
            }

        }

        for (int i = 0; i < aCoder.length(); ++i) {
            char c1 = aCoder.charAt(i);
            boolean bool2 = Character.isSpaceChar(c1);
            if (bool2) {
                chaineCodee = chaineCodee + " ";
            } else {
                int compteur = 0;
                char c2 = ALPHABET.charAt(compteur);

                while (c2 != c1) {
                    ++compteur;
                    c2 = ALPHABET.charAt(compteur);
                }
                if (compteur + DECALAGE > 25) {
                    c2 = ALPHABET.charAt(compteur + DECALAGE - 26);
                    chaineCodee = chaineCodee + c2;
                } else {
                    c2 = ALPHABET.charAt(compteur + DECALAGE);
                    chaineCodee = chaineCodee + c2;
                }
            }
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
