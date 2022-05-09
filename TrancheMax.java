import java.util.ArrayList;
import java.util.Scanner;

class TrancheMax {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Entree de la matrice
        System.out.println("Saisie de la matrice :");
        String matrice = clavier.nextLine();
        System.out.format("Matrice saisie :\n%s\n", matrice);
        clavier.close();

        // Validation de la matrice
        if (!checkFormat(matrice)) {
            return;
        }

        // Trouver la liste des lignes avec le plus grand nombre de 1 consecutif
        // Ces numéros de lignes sont stockés dans un tableau dynamique
        ArrayList<Integer> maxConsecutifList = findConsecutiveList(matrice);

        if (maxConsecutifList.isEmpty()) {
            System.out.println("Pas de lignes avec des 1 !");
        } else {
            System.out.println("Ligne(s) avec le plus de 1 consecutifs :");
            for (Integer index : maxConsecutifList) {
                System.out.println(index);
            }
        }
    }

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/
    public static boolean checkFormat(String matrice) {
        if (matrice.isBlank()) {
            System.out.println("Matrice vide !");
            return false;
        }
        String[] lignes = matrice.split(" {1,}");
        boolean c = checkChar(lignes);
        if (c) {
            boolean longueur = checkLineLength(matrice);
            if (longueur) {
                return true;
            } else {
                System.out.println("Matrice invalide, lignes de longueurs differentes !");
                return false;
            }

        } else {
            System.out.println("Matrice invalide : seuls '1', '0' et ' ' sont admis !");
            return false;
        }
    }

    public static String[] bonFormat(String matrice) {
        String[] lignes = matrice.split(" {1,}");

        ArrayList<String> lignesCorrectes = new ArrayList<String>();
        for (int i = 0; i < lignes.length; ++i) {
            String ligne1 = lignes[i];
            if (ligne1.length() > 0) {
                char c = ligne1.charAt(0);
                boolean isC = Character.isLetterOrDigit(c);
                if (isC) {
                    lignesCorrectes.add(ligne1);

                }
            }
        }
        String[] bonFormat = new String[lignesCorrectes.size()];
        for (int i = 0; i < lignesCorrectes.size(); ++i) {
            bonFormat[i] = lignesCorrectes.get(i);
        }
        return bonFormat;
    }

    public static boolean checkLineLength(String matrice) {
        String[] lignes = bonFormat(matrice);
        boolean longueur = true;

        for (int i = 0; i < lignes.length; ++i) {
            String ligne1 = lignes[i];
            for (int j = 0; j < lignes.length; ++j) {
                String ligne2 = lignes[j];
                if (ligne1.length() != ligne2.length()) {
                    longueur = false;
                }
            }
        }
        return longueur;
    }

    public static boolean checkChar(String[] lignes) {
        boolean isChar = true;
        for (int i = 0; i < lignes.length; ++i) {
            String testChar = lignes[i];
            for (int j = 0; j < lignes[i].length(); ++j) {
                char c = testChar.charAt(j);
                if (c != '0' && c != '1' && c != ' ') {
                    isChar = false;
                }
            }
        }
        return isChar;
    }

    public static ArrayList<Integer> findConsecutiveList(String matrice) {
        String[] lignes = bonFormat(matrice);
        int[] grand = new int[lignes.length];
        ArrayList<Integer> classement = new ArrayList<Integer>();
        for (int i = 0; i < lignes.length; ++i) {
            int somme = 0;
            int plusGrand = 0;
            for (int j = 0; j < lignes[0].length(); ++j) {

                if (lignes[i].charAt(j) == '1') {
                    ++somme;
                    if (somme >= plusGrand) {
                        plusGrand = somme;
                    }
                } else if (lignes[i].charAt(j) == '0') {
                    somme = 0;
                }

            }

            grand[i] = plusGrand;
        }

        int plusGrand = 0;
        boolean validation = false;
        for (int i = 0; i < grand.length; ++i) {
            if (grand[i] >= 1 && validation == false) {
                plusGrand = grand[i];
                validation = true;
                classement.add(i);

            } else if (grand[i] >= 1 && grand[i] == plusGrand) {
                classement.add(i);

            } else if (grand[i] >= 1 && grand[i] > plusGrand) {
                plusGrand = grand[i];
                classement.clear();
                classement.add(i);
            }

        }

        return classement;

    }

    /*******************************************
     * Ne rien modifier apres cette ligne
     *******************************************/
}
