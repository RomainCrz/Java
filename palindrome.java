import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un mot ou une phrase : ");
        String palindrome = input.nextLine();
        String inverse = "";
        String epure = "";

        palindrome = palindrome.toLowerCase();
        for (int i = 0; i < palindrome.length(); ++i) {
            char c = palindrome.charAt(i);
            boolean b1 = Character.isLetter(c);
            if (b1) {
                epure = epure + c;
            }
        }

        epure = epure.intern();
        int longueur = epure.length();
        for (int i = longueur - 1; i >= 0; --i) {
            inverse = inverse + epure.charAt(i);
            System.out.println(inverse);
        }
        inverse = inverse.intern();
        if (epure.equals(inverse)) {
            System.out.println("C'est un palindrome !");
        } else {
            System.out.println("Ce n'est pas un palindrome :( ");
        }
        input.close();

    }
}
