import java.util.Scanner;

public class TourDeMagie {

    public static void main(String[] args) {
        Spectateur spec = new Spectateur();
        Assistant assist = new Assistant();
        Papier papier = new Papier();
        Magicien magicien = new Magicien();
        System.out.println("[Spectateur] (j'entre en scène)");
        spec.setInfos();
        System.out.println("[Spectateur] (j'ai un montant qui convient)");
        papier.ecrire(spec);
        System.out.println("[Magicien] un petit tour de magie...");
        System.out.println("[Assistant] (je lis le papier)");
        assist.getAgePapier(papier);
        assist.getArgentPapier(papier);
        System.out.println("[Assistant] (je calcul mentalement)");
        assist.annonce();
        magicien.annonceAssist(assist);

    }

}

class Spectateur {
    private final static Scanner input = new Scanner(System.in);
    private int age;
    private int argent;

    private int demanderAge() {
        do {
            System.out.print("Quel âge ai-je ? ");
            age = input.nextInt();
        } while (age < 0 || age > 99);
        return age;
    }

    private int demanderArgent() {
        do {
            System.out.print("Combien d'argent ai-je en poche (<100) ");
            argent = input.nextInt();
        } while (argent < 0 || argent > 100);
        return argent;
    }

    public void setInfos() {
        demanderAge();
        demanderArgent();
    }

    public int getAge() {
        return age;
    }

    public int getArgent() {
        return argent;
    }

}

class Papier {
    private int age;
    private int argent;

    public void ecrire(Spectateur spec) {
        age = spec.getAge();
        argent = spec.getArgent();
    }

    public int getAge() {
        return age;
    }

    public int getArgent() {
        return argent;
    }

}

class Assistant {
    private int agePapier;
    private int argentPapier;

    public void getAgePapier(Papier papier) {
        agePapier = papier.getAge();
    }

    public void getArgentPapier(Papier papier) {
        argentPapier = papier.getArgent();
    }

    private int calcul() {
        return (agePapier * 2 + 5) * 50 + argentPapier - 365;
    }

    public int annonceCalcul() {
        int annonce = calcul();
        return annonce;
    }

    public void annonce() {
        System.out.println("[Assistant] J'annonce : " + annonceCalcul() + "! ");
    }

}

class Magicien {
    private int calculAssit;
    private int devineAge;
    private int devineArgent;

    public void annonceAssist(Assistant assist) {
        calculAssit = assist.annonceCalcul();
        calcul();
    }

    private void calcul() {
        calculAssit = calculAssit + 115;
        devineAge = calculAssit / 100;
        devineArgent = calculAssit % 100;
        System.out.println("Magicien] hum.. je vous que vous êtes agé de " + devineAge + " ans");
        System.out.println("et que vous avez " + devineArgent + " euros en poches !");
    }

}
