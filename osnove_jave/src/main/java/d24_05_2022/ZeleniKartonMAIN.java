package d24_05_2022;

import p24_05_2022.Sastojak;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMAIN {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
        Scanner s = new Scanner(System.in);

//        Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//        konstruktore
//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//        Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
//
//        U glavnoj klasi:
//        kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita


//        System.out.print("Unesite n: ");
//        int n = s.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("Unesite ime i prezime studenta: ");
//            String imeStudenta = s.next();
//            System.out.print("Unesite broj indexa: ");
//            int index = s.nextInt();
//            System.out.print("Unesite naziv predmeta: ");
//            String predmet = s.next();
//            System.out.print("Unesite ime i prezime profesora: ");
//            String imeProfesora = s.next();
//            System.out.print("Unesite ocenu: ");
//            int ocena = s.nextInt();
//
//            ZeleniKarton fakultet = new ZeleniKarton(imeStudenta, index, predmet, imeProfesora, ocena);
//            ispiti.add(fakultet);
//        }

        ZeleniKarton student1 = new ZeleniKarton("Miljana Cvetkovic",
                                                 1794,
                                                 "Uvod u geografiju",
                                                 "Milan Djordjevic",
                                                 10);

        ZeleniKarton student2 = new ZeleniKarton("Milan Jovanovic",
                                                1795,
                                                "Uvod u geografiju",
                                                "Milan Djordjevic",
                                                9);

        ZeleniKarton student3 = new ZeleniKarton("Vladimir Minic",
                                                1796,
                                                "Uvod u geografiju",
                                                "Milan Djordjevic",
                                                8);

        ZeleniKarton student4 = new ZeleniKarton("Mladen Simic",
                                                1797,
                                                "Uvod u geografiju",
                                                "Milan Djordjevic",
                                                7);

        ZeleniKarton student5 = new ZeleniKarton("Katarina Pesic",
                                                1798,
                                                "Uvod u geografiju",
                                                "Milan Djordjevic",
                                                5);

        ispiti.add(student1);
        ispiti.add(student2);
        ispiti.add(student3);
        ispiti.add(student4);
        ispiti.add(student5);

        for (int i = 0; i < ispiti.size(); i++) {
            System.out.println(ispiti.get(i).getNazivPredmeta() + " - " + ispiti.get(i).getOcena());
            System.out.println("Student: " + ispiti.get(i).getImePrezimeStudenta());
            System.out.println("Profesor: " + ispiti.get(i).getImePrezimeProfesora());
        }


        int sumaSve = 0;

        for (int i = 0; i < ispiti.size(); i++) {
            sumaSve = sumaSve + ispiti.get(i).getOcena();
        }

        System.out.println("Suma svih ocena je " + sumaSve);

        int sumaPolozeni = 0;

        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).daLiJeIspitPolozen()){
                sumaPolozeni = sumaPolozeni + ispiti.get(i).getOcena();
            }
        }

        System.out.println("Suma svih polozenih ispita je " + sumaPolozeni);


    }
}
