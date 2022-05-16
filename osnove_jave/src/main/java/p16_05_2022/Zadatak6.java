package p16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Napisati metodu koja stampa N zvezdica u istom redu.
//        Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *
//
//        Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//        N=9, print je=> * * * * * * * * *

        stampanjeZvezdice(10);
    }

    static void stampanjeZvezdice (int n){

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
}
