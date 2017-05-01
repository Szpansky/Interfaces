package basepackage;


public class Szescian implements Figura3D {


    public void rysuj() {
        System.out.println("Rysowanie Szescian");
    }


    public void przesun(int x, int y) {
        System.out.println("Przesunieto o: " + x + "" + y);
    }


    public void obrot() {
        System.out.println("Szescian zostal obrocony");
    }
}
