package p23_05_2022;

public class KorisnikFacebookPostMain {
    public static void main(String[] args) {

//        Kreirati klasu Korisnik koja ima
//        ime
//        prezime
//        gettere i settere za ime i prezime
//        konstuktore koje mislite da su vam potrebni
//        metoda koja stampa u formatu:
//        (ime) (prezime)
//
//        Kreirati klasu FacebookPost
//        opis
//        korisnik (referenca na korisnika koji je kreirao post)
//        konstrukore koje mislite da su vam potrebni
//        metoda print, stampa u formatu:
//        (ime) (prezime)
//        (opis post-a)
//
//        U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda


        Korisnik prvi = new Korisnik ();
        prvi.setIme("Miljana");
        prvi.setPrezime("Cvetkovic");

        FacebookPost objava = new FacebookPost();
        objava.setOpis("Zdravo, zdravooo!");
        objava.setKorisnik(prvi);

        objava.stampaj();



    }
}
