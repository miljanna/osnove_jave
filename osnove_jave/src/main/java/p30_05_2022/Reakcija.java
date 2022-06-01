package p30_05_2022;

public class Reakcija {
//    Kreirati klasu Reakcija koja ima
//    tip reakcije (smajli, like, srce)
//    ime i prezime korisnika koji je reagovao
//    gettere, settere i konstruktore

    public String reakcija;
    public String imePrezime;

    public Reakcija (){}

    public Reakcija (String reakcija, String imePrezime){
        this.reakcija = reakcija;
        this.imePrezime = imePrezime;
    }

    public String getReakcija() {
        return reakcija;
    }

    public void setReakcija(String reakcija) {
        this.reakcija = reakcija;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}
