package p16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Napisati metodu koja vraca suprotno negativna broj od prosledjenog.
//        Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//        Primer: Ako se metoda pozove za N=10, vraca -10
//        Ako se metoda pozove za N=-11, vraca 11


        int x = suprotanZnak(5);
        System.out.println("Suprotan znak je: " + x);
    }

    static int suprotanZnak (int broj){
        int suprotan = broj * (-1);
        return suprotan;
    }

}
