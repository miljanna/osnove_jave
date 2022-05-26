package p23_05_2022;

public class FilmReziserMain {
    public static void main(String[] args) {

//        Kreirati klasu Film koja ima:
//        naziv filma
//        iz koje godine je film
//        konstruktore, gettere i settere koji su potrebni
//        metodu print koja stampa podatke u formatu
//        naziv filma, godina
//
//        Kreirati klasu Reziser koja ima:
//        ime i prezime rezisera
//        startost
//        konstruktore, gettere i settere koji su potrebni
//        metodu print koja stampa podatke u formatu
//        ime prezime, starost.god
//
//        U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda

        Film prviFilm = new Film ();
        prviFilm.setnaziv("Seven");
        prviFilm.setgodina(1995);

        prviFilm.stampaj();

        Reziser prviReziser = new Reziser();
        prviReziser.setImeIPrezime("Miljana Cvetkovic");
        prviReziser.setStarost(28);

        prviReziser.stampaj();






    }
}
