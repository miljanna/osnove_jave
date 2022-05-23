package d19_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartAirConditioningMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Gorenje";
        klima1.potrosnjaDokHladi = 1;
        klima1.potrosnjaDokGreje = 2;
        klima1.temperatura = 28;
        klima1.mod = "greje";
        klima1.potrosnja();
        klima1.potrosenNovac();
        klima1.stampaj();

        System.out.println();

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Samsung";
        klima2.potrosnjaDokHladi = 1;
        klima2.potrosnjaDokGreje = 2;
        klima2.temperatura = 19;
        klima2.mod = "hladi";
        klima2.potrosnja();
        klima2.potrosenNovac();
        klima2.stampaj();




    }
}
