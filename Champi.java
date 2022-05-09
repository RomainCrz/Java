import java.util.Scanner;

class Champi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lamelles;
        boolean anneau;
        boolean chapeau;
        boolean foret;
        
        System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
        System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
        foret = input.nextBoolean();
        if (foret){
            System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
            lamelles = input.nextBoolean();
            if(lamelles){
                System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
                chapeau = input.nextBoolean();
                if (chapeau){
                    System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
                    anneau = input.nextBoolean();
                    if (anneau){
                        System.out.print("==> Le champignon auquel vous pensez est ");
                        System.out.print("l'amanite tue-mouches");
                    } else {
                        System.out.print("==> Le champignon auquel vous pensez est ");
                        System.out.print("le pied bleu");
                    }
                } else {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("la girolle");
                }

            } else {
                System.out.print("==> Le champignon auquel vous pensez est ");
                System.out.print("le cèpe de Bordeaux");

            }
        } else {
            System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
            chapeau = input.nextBoolean();
            System.out.print("==> Le champignon auquel vous pensez est ");
            if (chapeau){
                System.out.print("l'agaric jaunissant");
            } else {
                System.out.print("le coprin chevelu");
            }
        }
               
        input.close();
        
    }
}










