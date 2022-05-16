package d16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr. kosa crta (/)
//        stampa se=> / / / / /

        stampanjeNkaraktera(5, "*");
        System.out.println();
        stampanjeNkaraktera(10, "/");

    }
    static void stampanjeNkaraktera (int n, String karakter){
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");
        }
    }

}
