package p24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class SastojakMAIN {
    public static void main(String[] args) {
        ArrayList <Sastojak> nizSastojaka = new ArrayList<Sastojak>();
        Scanner s = new Scanner(System.in);

//        Kreirati klasu Sastojak koja ima:
//        naziv sastojka
//        cenu
//        gettere i settere
//        konstuktore
//
//        U glavnom programu kreirati 3 sastojka.
//        U glavnom programu kreirati niz sastojaka ucitavajuci
//        ih od korisnika. Ucitavaju se N sastojaka i na kraju
//        odstampati niz. Koristeci ArrayList-e


        System.out.print("Unesite n: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite ime sastojka: ");
            String ime = s.next();
            System.out.print("Unesite cenu: ");
            int cena = s.nextInt();

            Sastojak x = new Sastojak(ime, cena);
            nizSastojaka.add(x);
        }

        for (int i = 0; i < nizSastojaka.size(); i++) {
            System.out.print(nizSastojaka.get(i).getNaziv() + ", ");
            System.out.println(nizSastojaka.get(i).getCena());
        }

    }
}
