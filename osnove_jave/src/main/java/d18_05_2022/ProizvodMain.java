package d18_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {

//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

        Proizvod prviProizvod = new Proizvod ();
        prviProizvod.naziv = "Jagode";
        prviProizvod.cena = 249.99;
        prviProizvod.tezina = 250.00;
        prviProizvod.stampaj();

        System.out.println();

        Proizvod drugiProizvod = new Proizvod ();
        drugiProizvod.naziv = "Banane";
        drugiProizvod.cena = 119.99;
        drugiProizvod.tezina = 555.55;
        drugiProizvod.stampaj();






    }
}
