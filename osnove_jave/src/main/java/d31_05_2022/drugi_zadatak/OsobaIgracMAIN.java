package d31_05_2022.drugi_zadatak;

public class OsobaIgracMAIN {
    public static void main(String[] args) {

        Igrac fudbaler1 = new Igrac("Aleksandar Pesic", "4785654165", 1993,
                29, "golman", false);

        Igrac fudbaler2 = new Igrac("Nikola Pesic", "5555454165", 1990,
                2, "levi bek", true);

        Igrac fudbaler3 = new Igrac("Nikola Jankovic", "55577785215", 1989,
                77, "levo krilo", false);

        Karton crveni = new Karton("crveni");
        Karton zuti = new Karton("zuti");

        fudbaler1.dodajKarton(crveni);
        fudbaler1.dodajKarton(crveni);
        fudbaler1.dodajKarton(zuti);
        fudbaler2.dodajKarton(crveni);
        fudbaler3.dodajKarton(zuti);

        fudbaler1.stampaj();
        System.out.println();
        fudbaler2.stampaj();
        System.out.println();
        fudbaler3.stampaj();

    }
}
