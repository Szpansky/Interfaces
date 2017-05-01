package basepackage;


public class Main {

    public static void main(String[] args){

        Kwadrat kwadrat = new Kwadrat();
        kwadrat.rysuj();
        kwadrat.przesun(13,2);

        Kolo kolo = new Kolo();
        kolo.rysuj();
        kolo.przesun(13,2);

        Szescian szescian = new Szescian();
        szescian.rysuj();
        szescian.przesun(13,2);
        szescian.obrot();

        DziwnyPrzedmiot cos_innego = new DziwnyPrzedmiot();
        cos_innego.rysuj();
        cos_innego.przesun(13,2);
        cos_innego.obrot();
        cos_innego.zmniejsz();
        cos_innego.zwieksz();

    }




}
