package d16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.


        podaciOKorisniku ("0612994581013", "Miljana", "Cvetkovic",
                          1994, true );

    }
    static void podaciOKorisniku (String jmbg, String ime, String prezime,
                                  int godRodjenja, boolean daLiJeAktivan){

        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godRodjenja);
        System.out.println("Aktivan: " + daLiJeAktivan);

    }
}
