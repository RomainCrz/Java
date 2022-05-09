import java.util.ArrayList;

public class Premiers2 {
    public static void main(String[] args) {
        ArrayList<Boolean> premier = new ArrayList<Boolean>();
        for (int i = 0; i < 100; ++i) {
            premier.add(false);
        }
        premier.set(0, true);
        premier.set(1, true);
        for (int i = 3; i < premier.size(); ++i) {
            if (i % 2 == 0) {
                premier.set(i, true);
            }

        }
        for (int i = 3; i < premier.size(); ++i) {
            for (int j = 3; j <= Math.sqrt(i); ++j) {
                if (i % j == 0) {
                    premier.set(i, true);
                }
            }
        }
        for (int i = 0; i < premier.size(); ++i) {
            boolean resultat = premier.get(i);
            if (resultat == false) {
                System.out.println(i);
            }
        }

    }

}
