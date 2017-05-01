package basepackage;


public class DziwnyPrzedmiot implements FiguraINNA {

    @Override
    public void rysuj() {
        System.out.println("Rysowanie Dziwa");
    }

    @Override
    public void obrot() {
        System.out.println("Obracanie jakiegos przedmiotu");
    }

    @Override
    public void przesun(int x, int y) {
        System.out.println("Dziwny przedmiot przesuniety o: "+ x + y + 10);
    }

    @Override
    public void zmniejsz() {
        System.out.println("Zmniejszono przedmiot");
    }

    @Override
    public void zwieksz() {
        System.out.println("Zwiekszono przedmiot");
    }
}
