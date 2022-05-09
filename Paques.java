import java.util.Scanner;
public class Paques {
    private final static Scanner CLAVIER = new Scanner(System.in);

    public static int demanderAnnee(){
        int annee;
        do{
            System.out.println("Entrez une annee (1583-4000) : ");
            annee = CLAVIER.nextInt();
        } while (annee < 1583 || annee > 4000);
        return annee;
    }

    public static void afficheDate(int annee,int jour){
        String mois;
        System.out.print("Date de Paques en "+annee+" : ");
        if (jour <=31){
            mois = " mars";
        } else {
            mois = " avril";
            jour = jour -31;
        }
        System.out.println(jour + mois);
    }

    public static int datePaques (int annee){
        int jour = 0;
        int siecle;
        siecle = annee/100;
        System.out.println(siecle);
        int p = (8*siecle+13)/25;
        int q = siecle/4;
        int m = (15-p+siecle-q)%30;
        int n = (4+siecle-q)%7;
        int d = (m+(19*(annee%19)))%30;
        int e = (2 * (annee % 4) + 4 * (annee % 7) + 6 * d + n) % 7;
        jour = (e+d+22);
        System.out.println(jour+" avant");

        if (e==6 && (d==29 || (d==28&&(11*(m+1)%30)<19))){
            jour = jour-7;
        }

        System.out.println(e+" "+d);
        System.out.println(jour + " apres");
        return jour;

    }

    public static void main(String[] args) {
        int annee = demanderAnnee();
        int jour = datePaques(annee);
        afficheDate(annee, jour);
    }
}
