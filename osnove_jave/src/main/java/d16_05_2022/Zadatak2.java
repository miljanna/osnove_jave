package d16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Napisati funkciju koja za dva jednocifrena broja koja su
//        ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        novaVrednost(3,2);

    }
    static void novaVrednost (int a, int b){
        System.out.print("Prvi broj je: " + a + ", drugi broj je: " + b + ", nova vrednost je: " + a);
        System.out.println(b);
    }
}
