package d16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Napisati metodu stampajVrednostZa10Vecu
//        u kojoj se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

//        Nacin I:

        stampajVrednostZa10Vecu(5);
        stampajVrednostZa10Vecu(9);
        stampajVrednostZa10Vecu(3);
        stampajVrednostZa10Vecu(7);

//        Nacin II:

        System.out.print("Unesite vrednost n: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesi broj: ");
            int broj = s.nextInt();
            stampajVrednostZa10Vecu(broj);
        }
    }

    static void stampajVrednostZa10Vecu (int a){

        System.out.println("Broj " + a + " uvecan za 10 je " + a*10);
    }
}
