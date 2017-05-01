package basepackage;


public class Kolo implements Figura {

    public void rysuj() {
        System.out.println("Rysowanie Kola");
    }

    public void przesun(int x, int y) {
        System.out.println("Przesunieto o: "+ x * y );
    }
}