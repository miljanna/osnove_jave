package p16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Napisati metodu koja proverava da li je trougao pravougli.
//        Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//        Trougao je pravougli ukoliko je a*a+b*b=c*c


        boolean daLiJe = daLiJePravougli(4,5,2);
        System.out.println(daLiJe);

    }
    static boolean daLiJePravougli (int a, int b, int c){
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }
}
