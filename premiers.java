public class premiers {
    public static void main(String[] args) {
        boolean supprimes[] = new boolean[100];
        for (int i = 0; i < supprimes.length; i++) {
            supprimes[i] = false;
        }
        for (int i = 3; i < supprimes.length; i++) {
            if (i % 2 == 0) {
                supprimes[i] = true;
            }
        }

        for (int i = 2; i < supprimes.length; i++) {
            if (supprimes[i] == false) {
                for (int j = i + 1; j < supprimes.length; j++) {
                    if (j % i == 0) {
                        supprimes[j] = true;
                    }
                }
                if (supprimes[i] == false) {
                    System.out.print(i + " ");
                }
            }
        }
    }

}
