public class Texte {
    public static void main(String[] args) {
        for (int j = 10; j >= 0; --j) {
            System.out.println();

            for (int i = 0; i < j; ++i) {
                System.out.print(" ");
            }
            for (int i = 1; i < 10 - j; i++) {
                System.out.print(i);
            }

        }
    }
}