class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = { 2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6 };
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int[] tab2 = new int[1000];
        int compteur = 0;
        for (int i = 0; i < taille; ++i) {
            for (int j = 0; j < taille; ++j) {
                if (tab1[j] == tab1[i]) {
                    ++compteur;
                }

            }
            tab2[i] = compteur;
            compteur = 0;
        }
        int grand = 0;
        int nombre = 0;
        for (int i = 0; i < taille; i++) {
            if (tab2[i] > grand) {
                grand = tab2[i];
                nombre = tab1[i];
            }
        }
        System.out.println("Le nombre le plus frequent dans le tableau est le : ");
        System.out.println(nombre + " (" + grand + " x)");
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
