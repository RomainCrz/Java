public class Amicaux {
    public static void main(String[] args) {
        int[] nombres = { 1210, 45, 27, 220, 54, 284, 9890, 120, 1184 };
        System.out.println("Les paires de nombres amiaux sont : ");
        nombres = afficherAmicaux(nombres);
        int compteur = 0;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != 0) {
                ++compteur;
                System.out.print(nombres[i] + " ");
                if (compteur % 2 == 0) {
                    System.out.println();
                }
            }
        }

    }

    static int[] afficherAmicaux(int[] tab) {
        int[] tab1 = new int[tab.length];
        int tab2[] = new int[tab.length];
        for (int i = 0; i < tab.length; ++i) {
            int somme = 0;
            for (int j = 1; j <= tab[i]; ++j) {
                if (tab[i] % j == 0) {
                    somme += j;
                }
            }
            tab1[i] = somme;
        }

        for (int i = 0; i < tab1.length; ++i) {
            for (int j = i + 1; j < tab1.length; ++j) {
                if (tab1[i] == tab1[j]) {
                    tab2[i] = tab[i];
                    tab2[i + 1] = tab[j];
                }
            }
        }
        return tab2;
    }
}
