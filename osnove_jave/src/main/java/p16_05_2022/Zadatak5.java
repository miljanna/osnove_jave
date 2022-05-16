package p16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Zadatak
//        Napisati metodu stampajApsolutnuVrednost,
//        koja stampa apsolutnu vrednost prosledjene vrednosti.

        stampajApsolutnuVrednost(-5);
        stampajApsolutnuVrednost(5);

    }
    static void stampajApsolutnuVrednost (int broj){
        if (broj < 0) {
            broj = broj * (-1);
            System.out.println("Apsolutna vrednost je " + broj);
        } else {
            System.out.println("Apsolutna vrednost je " + broj);
        }
    }
}
