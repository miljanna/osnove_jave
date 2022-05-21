package p19_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Kreirati klasu Auto koja ima:
//        ime i prezime vozaca
//        marku automobila
//        broj vrata
//        potrosnju na 100km (npr: 10)
//        trenutnu brzinu kojom se auto krece
//        metodu za stampu koja stampa podatke u formatu:
//        [Vozac]
//	      [Marka] - [br vrata]-ro vrata
//        Sa potrosnjom od [potrosnja] l na 100km
//        [Trenutna brzina auta] km/h je trenutna brzina.
//        Primer:
//        Milan Jovanovic
//        BMW - 5-ro vrata
//        Sa potrosnjom od 10 l na 100km
//        200 km/h je trenutna brzina


//        U okviru klase Auto, implementirati jos 2 metode:
//        metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//        Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca
//        true ili false ako je trenutna brzina veca od ogranicenja.
//        metoda koja vraca visinu novcane kazne za prekoracenje, za svaku
//        jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//        U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu
//        informacija koje dobijete od njih.

//        Dopuniti klasu Auto tako da ima:
//        atribut godinu proizvodnje
//        atribut mesec do kad je registrovan auto (int)
//        atribut kubikaza auta (npr: 1600 - 5000)
//        metodu koja vraca da li je auto oldtimer,
//        svaki auto proizveden pre 1950 je oldtimer.
//        metodu koja vraca da li je istekla registracije.
//        Metoda kao parametar prima trenutni mesec i na
//        osnovu toga vraca true ili false.
//        metodu koja racuna i vraca cenu registracije za auto.
//        Za automobile do 2000 kubika cena registracije kubikaza * 100din,
//        za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

//        Dopuniti klasu Auto tako da ima:
//        kapacitet rezervoara
//        trenutnu kolicinu goriva u rezervoaru (u litrima)
//        metodu natoci gorivo, metoda prima kao parametar litrazu
//        goriva koja se toci a vraca novcanu vrednost goriva.
//        Litar goriva je 170din. Vodite racuna da trenutna
//        kolicina goriva ne predje kapacitet rezervoara, takodje ukoliko
//        se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi
//        ne racunate u cenu.

//        Dopuniti klasu Auto, tako da ima
//        metodu koja vraca da li auto nad kojim je pozvana metoda
//        ide istom brzinom kao i auto sa kojim se poredi. Ova metoda
//        poredi brzinu sa drugim autom, i parametar metode treba da bude tipa Auto.
//        HINT: Ova metoda treba da se ponasa kao metoda equals za stringove.
//        Zovemo metodu nad jednim stringom i poredimo ga sa drugim,
//        tako i ovde zovemo metodu nad jednim autom i poredimo ga sa
//        drugim (NE SA BRZINOM DRUGOG, NEGO BAS SA AUTOM)




        Auto auto1 = new Auto ();
        auto1.imeIPrezime = "Miljana Cvetkovic";
        auto1.marka = "BMW";
        auto1.brVrata = 5;
        auto1.potrosnja = 10;
        auto1.brzina = 55;
        auto1.registracija = "LE066RS";
        auto1.klima = true;
        auto1.godinaProizvodnje = 1949;
        auto1.mesecDoKadaJeRegistracija = 6;
        auto1.kubikaza = 1500;
        auto1.kapacitetRezervoara = 15;
        auto1.trenutnoGorivo = 8;
        auto1.stampaj();
        System.out.println();

        auto1.dodajGas();
        System.out.println("Nova brzina je: " + auto1.brzina);
        auto1.koci();
        System.out.println("Nova brzina je: " + auto1.brzina);
        double daLiJeKlimaUkljucena = auto1.potrosnjaKlima();
        System.out.println("Potrosnja je: " + daLiJeKlimaUkljucena);
        boolean prekoracenje = auto1.prekoracenjeBrzine(50);
        if (prekoracenje){
            System.out.println("Prekoracili ste brzinu!");
        } else {
            System.out.println("Niste prekoracili brzinu!");
        }
        int kazna = auto1.novcanaKazna(50);
        System.out.println("Kazna iznosi: " + kazna);

        if (auto1.oldtimer()){
            System.out.println("Auto je oldtimer.");
        } else {
            System.out.println("Auto nije oldtimer.");
        }

        if (auto1.daLiJeIsteklaReg(9)){
            System.out.println("Registracija je istekla!");
        } else {
            System.out.println("Registracija nije istekla!");
        }
        System.out.println("Cena registracije je: " + auto1.cenaRegistracije());
        System.out.println("Cena natocenog goriva je: " + auto1.natociGorivo(3));

        System.out.println();



        Auto auto2 = new Auto ();
        auto2.imeIPrezime = "Miroslav Markovic";
        auto2.marka = "AUDI";
        auto2.brVrata = 5;
        auto2.potrosnja = 10;
        auto2.brzina = 100;
        auto2.registracija = "LE003MM";
        auto2.klima = false;
        auto2.godinaProizvodnje = 2015;
        auto2.mesecDoKadaJeRegistracija = 9;
        auto2.kubikaza = 2800;
        auto2.kapacitetRezervoara = 11;
        auto2.trenutnoGorivo = 11;
        auto2.stampaj();
        System.out.println();

        auto2.dodajGas();
        System.out.println("Nova brzina je: " + auto1.brzina);
        auto2.koci();
        System.out.println("Nova brzina je: " + auto1.brzina);
        daLiJeKlimaUkljucena = auto2.potrosnjaKlima();
        System.out.println("Potrosnja je: " + daLiJeKlimaUkljucena);

        prekoracenje = auto2.prekoracenjeBrzine(50);
        if (prekoracenje){
            System.out.println("Prekoracili ste brzinu!");
        } else {
            System.out.println("Niste prekoracili brzinu!");
        }
        kazna = auto2.novcanaKazna(50);
        System.out.println("Kazna iznosi: " + kazna);

        if (auto2.oldtimer()){
            System.out.println("Auto je oldtimer.");
        } else {
            System.out.println("Auto nije oldtimer.");
        }

        if (auto2.daLiJeIsteklaReg(8)){
            System.out.println("Registracija je istekla!");
        } else {
            System.out.println("Registracija nije istekla!");
        }
        System.out.println("Cena registracije je: " + auto2.cenaRegistracije());
        System.out.println("Cena natocenog goriva je: " + auto2.natociGorivo(12));


        System.out.println("Da li automobili idu istom brzinom: " + auto1.uporedjivanjeBrzine(auto2));











    }
}
