import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
                // { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                // 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                // 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                // { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                // { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                // { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                // { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                // { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                // { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                // { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                // { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                // { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                // { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                // { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
                // { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
                // { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                // 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                // { 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 1, 1 },
                { 0, 0, 1 },
                { 1, 1, 1 },

        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/
        boolean arret = false;

        for (int i = 0; i < carte.length; ++i) {

            for (int j = 0; j < carte[i].length; ++j) {
                if (carte[i][j] != 0 && carte[i][j] != 1 && arret != true) {
                    arret = true;
                    System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '"
                            + carte[i][j]);
                    System.out.print("' trouvée en position [" + i);
                    System.out.print("][" + j);
                    System.out.println("]");
                }
            }

        }
        if (arret != true) {
            ArrayList<Integer> num = new ArrayList<Integer>();
            ArrayList<Integer> ipos = new ArrayList<Integer>();
            ArrayList<Integer> jpos = new ArrayList<Integer>();
            for (int i = 0; i < carte.length; ++i) {

                for (int j = 0; j < carte[i].length; ++j) {
                    num.add(carte[i][j]);
                    ipos.add(i);
                    jpos.add(j);
                }

                int compteur = 0;
                while (num.get(compteur) == 0) {
                    ++compteur;
                }

                while (compteur < num.size()) {
                    if (num.get(compteur) == 0) {
                        int compteur2 = compteur;
                        boolean etang = false;
                        while (compteur2 < num.size() - 1) {
                            if (num.get(compteur2) == 1) {
                                etang = true;
                            }
                            ++compteur2;
                        }
                        if (etang == true) {
                            carte[ipos.get(compteur)][jpos.get(compteur)] = 1;
                        }
                    }
                    ++compteur;
                }

                for (int j = 0; j < carte[i].length; ++j) {
                    // System.out.print(carte[i][j]);
                }
                num.clear();
                ipos.clear();
                // System.out.println();
            }
            int cloture = 0;
            for (int i = 0; i < carte.length; ++i) {
                for (int j = 0; j < carte[i].length; ++j) {
                    if (i == 0) {
                        if (j == 0) {
                            if (carte[i][j] == 1) {
                                cloture += 2;
                                if (carte[i][j + 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i + 1][j] == 0) {
                                    cloture += 1;
                                }
                            }
                        } else if (j == carte[i].length - 1) {
                            if (carte[i][j] == 1) {
                                cloture += 2;
                                if (carte[i][j - 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i + 1][j] == 0) {
                                    cloture += 1;
                                }
                            }
                        } else {
                            if (carte[i][j] == 1) {
                                cloture += 1;
                                if (carte[i][j - 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i][j + 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i + 1][j] == 0) {
                                    cloture += 1;
                                }
                            }
                        }
                    } else if (i == carte.length - 1) {
                        if (j == 0) {
                            if (carte[i][j] == 1) {
                                cloture += 2;
                                if (carte[i][j + 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i - 1][j] == 0) {
                                    cloture += 1;
                                }
                            }
                        } else if (j == carte[i].length - 1) {
                            if (carte[i][j] == 1) {
                                cloture += 2;
                                if (carte[i][j - 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i - 1][j] == 0) {
                                    cloture += 1;
                                }
                            }
                        } else {
                            if (carte[i][j] == 1) {
                                cloture += 1;
                                if (carte[i][j - 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i][j + 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i - 1][j] == 0) {
                                    cloture += 1;
                                }
                            }
                        }

                    } else {
                        if (j == 0) {
                            if (carte[i][j] == 1) {
                                cloture += 1;
                                if (carte[i][j + 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i - 1][j] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i + 1][j] == 0) {
                                    cloture += 1;
                                }
                            }
                        } else if (j == carte[i].length - 1) {
                            if (carte[i][j] == 1) {
                                cloture += 1;
                                if (carte[i][j - 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i - 1][j] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i + 1][j] == 0) {
                                    cloture += 1;
                                }
                            }
                        } else {
                            if (carte[i][j] == 1) {
                                if (carte[i][j - 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i][j + 1] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i - 1][j] == 0) {
                                    cloture += 1;
                                }
                                if (carte[i + 1][j] == 0) {
                                    cloture += 1;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Il vous faut " + cloture * 2.5 + " mètres de clôture pour votre terrain.");

        }
        System.out.println("Votre carte du terrain n'a pas le bon format :");
        System.out.print("bord extérieur entrant trouvé en position [");
        System.out.print("][");
        System.out.println("]");

        System.out.print("Il vous faut ");
        System.out.println(" mètres de clôture pour votre terrain.");

        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}
