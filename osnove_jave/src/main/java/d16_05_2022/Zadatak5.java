package d16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//        Napomena: Resiti bez koriscenja petlji.


        int ukBrojCelihBrojeva = izbroji(2,10);
        System.out.println("Ukupan broj celih brojeva je: " + ukBrojCelihBrojeva);
    }

    static int izbroji (int m, int n){
        if (m > n) {
            return (m - n - 1);
        } else {
            return (n - m - 1);
        }
    }
}
