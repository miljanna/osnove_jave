package p18_05_2022;

import java.util.Scanner;

public class RacunMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


//      Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.

//        Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun.
//        Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//        Primer izvrsenja:
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//        Primalac: Marko Markovic, 840-23932-334, stanje: 200
//        Unesite sumu za transakciju: 500
//        Stanje nakon stransakcije
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//        Primalac: Marko Markovic, 840-23932-334, stanje: 700

        Racun posiljalac = new Racun();
        posiljalac.imeIPrezime = "Miljana Cvetkovic";
        posiljalac.broj = "840-5588-85-20";
        posiljalac.stanje = 10000;

        Racun primalac = new Racun ();
        primalac.imeIPrezime = "Ivana Ivanic";
        primalac.broj = "840-5588-85-30";
        primalac.stanje = 5000;

        System.out.println("Posaljilac " + posiljalac.imeIPrezime + ", " + posiljalac.broj +
                           ", " + posiljalac.stanje);
        System.out.println("Primalac " + primalac.imeIPrezime + ", " + primalac.broj +
                ", " + primalac.stanje);

        System.out.println("Unesite sumu za transkaciju: ");
        int suma = s.nextInt ();

        posiljalac.stanje -= suma;
        primalac.stanje += suma;

        System.out.println("Stanje nakon transakcije: ");

        System.out.println("Posaljilac " + posiljalac.imeIPrezime + ", " + posiljalac.broj +
                ", " + posiljalac.stanje);
        System.out.println("Primalac " + primalac.imeIPrezime + ", " + primalac.broj +
                ", " + primalac.stanje);






    }
}
