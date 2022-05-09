import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = "";
        do {
            System.out.print("Entre un nombre entier : ");
            int rep = input.nextInt();
            int iteratif = Iteratif(rep);
            int recursif = Recursif(rep);
            System.out.println("Methode itérative : ");
            System.out.println("F(" + rep + ") = " + iteratif);
            System.out.println("Methode récursive : ");
            System.out.println("F(" + rep + ") = " + recursif);
            System.out.print("Voulez vous recommencer [o/n] ? ");
            c = input.next();
        } while (c != "n");
        input.close();
    }

    static int Iteratif(int n) {
        int Fn = 0; // stocke F(i) , initialisé par F(0)
        int Fn_1 = Fn; // stocke F(i-1), initialisé par F(0)
        int Fn_2 = 1; // stocke F(i-2), initialisé par F(-1)
        if (n > 0)
            for (int i = 1; i <= n; ++i) {
                Fn = Fn_1 + Fn_2; // pour n>=1 on calcule F(n)=F(n-1)+F(n-2)
                Fn_2 = Fn_1; // et on décale...
                Fn_1 = Fn;
            }
        return Fn;
    }

    static int Recursif(int n) {
        if (n == 2) {
            int Fn = 1;
            return Fn;
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            int Fn1 = Recursif(n - 1);
            int Fn2 = Recursif(n - 2);
            int Fn = Fn1 + Fn2;
            return Fn;
        }

    }

}
