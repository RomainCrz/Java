import java.util.Scanner;

public class Puissance4 {
    private final static int vide = 0;
    private final static int croix = 1;
    private final static int rond = 2;
    static Scanner input = new Scanner(System.in);

    public static int[][] initialise(int[][] grille) {
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[0].length; j++) {
                grille[i][j] = vide;
            }
        }
        return grille;
    }

    public static void afficheGrille(int[][] grille) {
        String[][] afficheGrille = new String[grille.length + 1][grille[0].length];
        for (int i = 0; i < afficheGrille.length; i++) {
            if (i != afficheGrille.length - 1) {
                for (int j = 0; j < afficheGrille[0].length; j++) {
                    if (j == 0) {
                        System.out.print(" |");
                    }
                    if (grille[i][j] == vide) {
                        System.out.print(" |");
                    } else if (grille[i][j] == croix) {
                        System.out.print("X|");
                    } else {
                        System.out.print("O|");
                    }
                }
                System.out.println();
            } else {
                System.out.print("=");
                for (int j = 0; j < afficheGrille[0].length; j++) {
                    if (j != afficheGrille[0].length - 1) {
                        System.out.print("=" + (j + 1));
                    } else {
                        System.out.print("=" + (j + 1) + "==");
                    }
                }
            }
        }
        System.out.println();
    }

    static int quiJoue(int joueur) {
        if (joueur % 2 != 0) {
            System.out.println("C'est au tour du joueur 1");
            return croix;
        } else {
            System.out.println("C'est au tour du joueur 2");
            return rond;
        }

    }

    static void joue(int[][] grille, int colonne, int joueur) {
        int i = 5;
        while (grille[i][colonne] != vide && i != 0) {
            --i;
        }
        if (grille[i][colonne] == vide) {
            if (joueur == 1) {
                grille[i][colonne] = croix;
            } else {
                grille[i][colonne] = rond;
            }
        } else {
            do {
                System.out.print("Dans quelle colonne placer le jeton ? : ");
                colonne = input.nextInt() - 1;
            } while (colonne > 6 || colonne < 0);
            joue(grille, colonne, joueur);
        }

    }

    static boolean plein(int grille[][]) {
        boolean plein = true;
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[0].length; j++) {
                if (grille[i][j] == vide) {
                    plein = false;
                }
            }
        }
        return plein;
    }

    static boolean estCeGagne(int[][] grille, int joueur) {
        int somme = 0;
        int test;
        if (joueur == 1) {
            test = croix;
        } else {
            test = rond;
        }

        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[0].length; j++) {
                somme = 0;

                int nbPions = 0;

                if (grille[i][j] == test) {

                    if (j <= 3) {
                        for (int k = j; k < j + 4; ++k) {
                            if (grille[i][k] == test) {
                                ++somme;
                            }
                        }
                        if (nbPions < somme) {
                            nbPions = somme;
                        }
                        somme = 0;
                    }

                    if (i > 2) {
                        for (int k = i; k > i - 4; --k) {
                            if (grille[k][j] == test) {
                                ++somme;
                            }
                        }
                        if (nbPions < somme) {
                            nbPions = somme;
                        }
                        somme = 0;
                    }

                    if (i > 2 && j <= 3) {
                        int j2 = j;
                        for (int k = i; k > i - 4; --k) {
                            if (grille[k][j2] == test) {
                                ++somme;
                            }
                            j2 = j2 + 1;

                        }
                        if (nbPions < somme) {
                            nbPions = somme;
                        }
                        somme = 0;
                    }

                    if (i <= 2 && j <= 3) {
                        int j2 = j;
                        for (int k = i; k < i + 4; ++k) {
                            if (grille[k][j2] == test) {
                                ++somme;
                            }
                            j2 = j2 + 1;

                        }
                        if (nbPions < somme) {
                            nbPions = somme;
                        }
                        somme = 0;
                    }
                }

                if (nbPions == 4) {
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[][] grille = new int[6][7];
        grille = initialise(grille);
        // grille[2][0] = croix;
        // grille[2][2] = rond;
        afficheGrille(grille);
        int joueur = 1;
        int colonne;
        boolean gagne = false;
        do {
            joueur = quiJoue(joueur);
            do {
                System.out.print("Dans quelle colonne placer le jeton ? : ");
                colonne = input.nextInt() - 1;
            } while (colonne > 6 || colonne < 0);
            joue(grille, colonne, joueur);
            afficheGrille(grille);
            gagne = estCeGagne(grille, joueur);
            if (!gagne) {
                ++joueur;
            }
        } while (plein(grille) == false && gagne == false);
        if (gagne == true) {
            System.out.println("Le joueur " + joueur + " a gagné !");
        } else {
            System.out.println("Egalité !");
        }

    }
}
