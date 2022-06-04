package d03_06_2022;

public class Main {
    public static void main(String[] args) {
//        U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko
//        Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

            Korpa korpa = new Korpa();
            Ambalaza tetra = new Tetrapak("1234", "Mleko", 90, 120, true, 150);
            Ambalaza staklo = new StaklenaAmbalaza("741258", "Pivo", 330, 340,
                    100., true, 160);

            SuperKartica kart = new SuperKartica("123", "Jovana Gojkovic", 200);

            korpa.dodajAmbalazu(tetra);
            korpa.dodajAmbalazu(staklo);


            System.out.println("Ukupna cena korpe je: " + korpa.ukupnaCenaKorpe(kart));
        }

}
