package d18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {

//        Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//        atribut za mod (hladi/greje)
//        metodu za stampu - stampa u formatu
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning
//        i za svaki od njih pozvati metodu za stampu


        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Samsung";
        klima1.temperatura = 20;
        klima1.mod = "Hladi";
       klima1.stampaj();

        System.out.println();

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Gree";
        klima2.temperatura = 28;
        klima2.mod = "Greje";
        klima2.stampaj();

    }
}
