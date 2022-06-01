package d31_05_2022.drugi_zadatak;

public class Osoba {
//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)

    protected String imePrezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba (){}

    public Osoba(String imePrezime, String jmbg, int godinaRodjenja) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampaj (){
        System.out.println(this.imePrezime + ", " + this.jmbg + ", " + this.godinaRodjenja);
    }
}
