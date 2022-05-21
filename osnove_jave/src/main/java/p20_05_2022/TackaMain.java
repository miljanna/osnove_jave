package p20_05_2022;

public class TackaMain {
    public static void main(String[] args) {


//    Za klasu Tacka, koja ima privatne atribute:
//    x - x koordinata
//    y - y koordinata
//    metodu stampaj
//    imamo difoltni konstruktor
//    imamo konstuktor koji prima obe koordinate za kreiranje objekta
//    U glavnom programu kreirati objekte

        Tacka a  = new Tacka();
        a.x = 0;
        a.y = 5;
        a.stampaj();

        Tacka b = new Tacka(15, 19);
        b.stampaj();




    }
}
