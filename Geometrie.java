import java.util.Scanner;

public class Geometrie {
    static private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Triangleiso tri = new Triangleiso();
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        double x;
        double y;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Construction d'un nouveau point");
            System.out.print("Veuillez entrer x : ");
            x = input.nextDouble();
            System.out.print("Veuillez entrer y : ");
            y = input.nextDouble();
            if (i == 1) {
                p1.setCoord(x, y);
            } else if (i == 2) {
                p2.setCoord(x, y);
            } else {
                p3.setCoord(x, y);
            }

        }
        tri.calculPerimetre(p1, p2, p3);
        if (tri.estIso()) {
            System.out.println("Le triangle est isocèle");
        }

    }

}

class Point {
    private double x;
    private double y;

    public void setCoord(double xbis, double ybis) {
        if (xbis >= 0 && ybis >= 0) {
            x = xbis;
            y = ybis;
        } else {
            System.out.println("Coordonée négative");
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}

class Triangleiso {
    private double x1, y1, x2, y2;
    private double s1, s2, s3;
    private double segment;
    private double perimetre = 0;

    public void calculPerimetre(Point p1, Point p2, Point p3) {
        perimetre += calculSegment(p1, p2);
        s1 = calculSegment(p1, p2);
        perimetre += calculSegment(p1, p3);
        s2 = calculSegment(p1, p3);
        perimetre += calculSegment(p2, p3);
        s3 = calculSegment(p2, p3);
        System.out.println("Périmètre : " + perimetre);
    }

    private double calculSegment(Point p1, Point p2) {
        x1 = p1.getX();
        y1 = p1.getY();
        x2 = p2.getX();
        y2 = p2.getY();

        segment = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        return segment;
    }

    public boolean estIso() {
        boolean estIso = false;
        if (s1 == s2) {
            estIso = true;
        } else if (s1 == s3) {
            estIso = true;
        } else if (s2 == s3) {
            estIso = true;
        }

        return estIso;
    }

}
