import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Decharge {
	private static DecimalFormat df = new DecimalFormat("#.000");

	/*******************************************
	 * Completez le programme a partir d'ici.
	 *******************************************/
	public static double calculerDistance(int x1, int y1, int x2, int y2) {
		double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		return distance;
	}

	public static int plusProche(int x, int y, int[] coordonneesHabitations) {
		double a = 0;
		double b = 1000000;
		int coordonnee = 0;
		for (int i = 0; i < coordonneesHabitations.length; i = i + 2) {
			a = calculerDistance(x, y, coordonneesHabitations[i], coordonneesHabitations[i + 1]);
			if (a < b) {
				b = a;
				coordonnee = i / 2;

			}

		}
		return coordonnee;
	}

	public static int[] troisPlusProches(int x, int y, int[] coordonneesHabitations) {
		int[] tmp = new int[coordonneesHabitations.length];
		int[] ttp = new int[6];
		System.arraycopy(coordonneesHabitations, 0, tmp, 0, coordonneesHabitations.length);
		ArrayList<Double> classement = new ArrayList<Double>();
		ArrayList<Integer> liste = new ArrayList<Integer>();
		ArrayList<Integer> liste2 = new ArrayList<Integer>();
		double[][] listes = new double[coordonneesHabitations.length][coordonneesHabitations.length];
		double test = 0;
		double da;
		double db;
		double dc = 0;

		for (int i = 0; i < coordonneesHabitations.length; i = i + 2) {

			test = calculerDistance(x, y, coordonneesHabitations[i], coordonneesHabitations[i + 1]);
			classement.add(test);
			liste.add(i);
			liste2.add(i + 1);
		}

		for (int i = 0; i < classement.size(); i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					listes[i][j] = classement.get(i);
				} else if (j == 1) {
					listes[i][j] = liste.get(i);
				} else {
					listes[i][j] = liste2.get(i);
				}
			}

		}

		for (int i = 0; i < classement.size(); ++i) {
			if (i <= 2) {
				for (int j = i + 1; j < classement.size(); ++j) {
					da = classement.get(i);
					db = classement.get(j);
					dc = da;

					if (db < da) {
						classement.set(i, db);
						classement.set(j, dc);

					}

				}
			}
		}

		for (int i = 0; i < ttp.length; i += 2) {
			double ligne = classement.get(i / 2);
			ttp[i] = tmp[(int) listes[calculTableau(listes, ligne)][1]];
			ttp[i + 1] = tmp[(int) listes[calculTableau(listes, ligne)][2]];
		}
		return ttp;
	}

	public static int calculTableau(double[][] listes, double ligne) {
		int i = 0;
		while (ligne != listes[i][0]) {
			++i;
		}
		return i;
	}

	public static int[] meilleurePlace(int x, int y, int[] coordonneesHabitations) {
		int ttp[] = troisPlusProches(x, y, coordonneesHabitations);
		int cx = 0;
		int cy = 0;
		for (int i = 0; i < ttp.length; i = i + 2) {
			cx = cx + ttp[i];
			cy = cy + ttp[i + 1];
		}
		cx = (int) cx / 3;
		cy = (int) cy / 3;
		int[] grave = { cx, cy };
		return grave;
	}

	/*******************************************
	 * Ne rien modifier apres cette ligne.
	 *******************************************/

	public static void afficheTroisPlusProches(int x, int y, int[] coordonneesHabitations) {
		int[] tpp = troisPlusProches(x, y, coordonneesHabitations);

		System.out.println("(" + x + "," + y + ") est a :");
		for (int i = 0; i < 3; i++) {
			System.out.println("    " + df.format(calculerDistance(x, y, tpp[2 * i], tpp[2 * i + 1])) + " de ("
					+ tpp[2 * i] + "," + tpp[2 * i + 1] + ")");
		}
	}

	// PROGRAMME PRINCIPAL
	public static void main(String args[]) {

		int[] coordonneesHabitations = {
				9, 30, 18, 8, 3, 18, 25, 36
		};

		// Lecture des donnees
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrez la coordonnee x de la decharge: ");
		int x = clavier.nextInt();
		System.out.print("Entrez le coordonnee y de la decharge: ");
		int y = clavier.nextInt();

		// trouve les coordonnees de l'habitation la plus proche
		// (identifiees par l'indice correspondant dans le tableau
		// de coordonnees)
		int plusProche = plusProche(x, y, coordonneesHabitations);
		System.out.println("--- Question 1 ---");
		System.out.println("Coordonnees de l'habitation la plus proche de la decharge :");
		System.out.println("(" + coordonneesHabitations[plusProche * 2] + ","
				+ coordonneesHabitations[plusProche * 2 + 1] + ") ; distance = " +
				df.format(calculerDistance(x, y, coordonneesHabitations[plusProche * 2],
						coordonneesHabitations[plusProche * 2 + 1]))
				+ " metres");

		// trouve les coordonnees des 3 habitations les plus proches et affiche les
		// coordonnees

		System.out.println("--- Question 2 ---");
		System.out.println("Coordonnees des 3 habitations les plus proches de la decharge :");
		afficheTroisPlusProches(x, y, coordonneesHabitations);

		// affiche le centre de gravite des 3 plus proches (la meilleure place)
		int[] grav = meilleurePlace(x, y, coordonneesHabitations);
		System.out.println("--- Question 3 ---");
		System.out.println("Coordonnees de la meilleure place pour la decharge :");
		System.out.println("(" + grav[0] + "," + grav[1] + ")");
		clavier.close();
	}

}
