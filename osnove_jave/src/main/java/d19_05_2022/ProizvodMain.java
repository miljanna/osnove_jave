package d19_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ProizvodMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Napisati klasu Proizvod koja ima atribute:
//        -naziv proizvoda (String)
//        -cenu proizvoda (double)
//        -težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}

//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju
//        treba povećati cenu. Ova funkcija treba da menja atribut cena i
//        ova funkcija nema povratnu vrednost.

//        vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//        a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije
//        ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.

//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod
//        šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena
//        postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din

//        U glavnom programu kreirati minimum 2 proizvoda i
//        za svaki od njih pozvati svaku od definisanih funkcija.


        Proizvod telefon = new Proizvod ();
        telefon.naziv = "Iphone 12 pro max";
        telefon.cena = 90000;
        telefon.tezina = 300;
        telefon.povecajCenu (5000);
        telefon.vratiCenuSaPopustom(25);
        telefon.racunajPostarinu();
        telefon.stampaj();

        System.out.println();

        Proizvod knjiga = new Proizvod ();
        knjiga.naziv = "Covek po imenu Uve";
        knjiga.cena = 1200;
        knjiga.tezina = 99;
        knjiga.povecajCenu (300);
        knjiga.vratiCenuSaPopustom(10);
        knjiga.racunajPostarinu();
        knjiga.stampaj();

    }
}
