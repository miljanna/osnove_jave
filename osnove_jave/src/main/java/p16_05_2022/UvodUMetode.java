package p16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class UvodUMetode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Zadatrak
//        Napisati metodu koja stampa ime i prezime i u glavnom
//        programu pozvati metodu na izvrsenje 5 puta.

        imeIPrezime();
        imeIPrezime();
        imeIPrezime();
        imeIPrezime();
        imeIPrezime();

    }

    static void imeIPrezime () {
        System.out.println("Miljana Cvetkovic");
    }

}
