package d31_05_2022;


public class OsobaMAIN {
    public static void main(String[] args) {


        Igrac fudbaler = new Igrac("Mladen Simic", "7758415485", 1992,
                23, "stoper", true);
        Igrac kosarkas = new Igrac("Nikola Simic", "45485454744", 1995,
                4, "plejmejker", false);

        fudbaler.stampaj();
        kosarkas.stampaj();
        System.out.println();

        Trener prvi = new Trener("Marko Jovanovic", "5418465877", 1979,
                26, "kondicioni");
        Trener drugi = new Trener("Stefan Pavlovic", "89748564588", 1962,
                32, "personalni");

        prvi.stampaj();
        drugi.stampaj();




    }
}
