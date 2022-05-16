package d16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Napisati funkciju koja za tri prosledjena broja vraca
//        najmanji od ta 3. U glavnom programu iskoristi funkciju
//        i ispisti odgovarajucu poruku.

        int najmanji = najmanjiBroj(15,30,28);

        System.out.println("Najmanji broj je: " + najmanji);

    }
    static int najmanjiBroj (int a, int b, int c){

        if (a < b && a < c){
            return a;
        } else if ( b < a && b < c) {
            return b;
        } else {
            return c;
        }

    }

}
