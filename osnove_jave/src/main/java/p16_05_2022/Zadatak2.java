package p16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Zadatak
//        Napisati dve metode, jedna metoda sluzi za stampanje
//        imena a druga sluzi za stampanje prezimena. U glavnom programu pozvati
//        metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
//        Primer izvrsenja:
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic

        for (int i = 0; i < 5; i++) {
            ime();
            prezime();
        }
    }

    static void ime () {
        System.out.print("Miljana ");
    }

    static void prezime (){
            System.out.println("Cvetkovic");
    }




}
