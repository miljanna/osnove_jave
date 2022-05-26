package d23_05_2022;

public class AutorKnjigaMAIN {
    public static void main(String[] args) {

//        Kreirati klasu Autor koja ima
//        -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//        -naziv
//        -godina izdanja
//        -autor
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//        (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.


        Autor pisac = new Autor("Miljana Cvetkovic");
        Knjiga jedan = new Knjiga("88778-8874-6676-77", "Covek po imenu Uve", 2020, pisac);

        jedan.stampaj();
        System.out.println();

        Autor pisac2 = new Autor("Milan Jovanovic");
        Knjiga dva = new Knjiga("54855-8465-4787-88", "Ana Karenjina", 2005, pisac2);

        dva.stampaj();
        System.out.println();

        Autor pisac3 = new Autor("Vladimir Minic");
        Knjiga tri = new Knjiga("56415-8547-5415-99", "Stranac", 1998, pisac3);

        tri.stampaj();



    }
}
