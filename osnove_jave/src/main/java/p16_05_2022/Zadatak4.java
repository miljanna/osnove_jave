package p16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
//        za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
//        U gravnom programu pozvati nekoliko puta funkciju sa razlicitim
//        prosledjenim vrednostima.

        operacija(2, 2);

    }
    static void operacija (int broj1, int broj2){
        System.out.println("Ovo je zbir: " + (broj1 + broj2));
        System.out.println("Ovo je razlika: " + (broj1 - broj2));
        System.out.println("Ovo je proizvod: " + (broj1 * broj2));
        System.out.println("Ovo je kolicnik: " + (broj1 / broj2));
    }


}
