package p02_06_2022;

public abstract class Student {
//    Kreirati apstraktnu klasu Student koja ima:
//    ime i prezime studenta
//    broj indeksa
//    godinu studija
//    gettere, settere i konstruktore
//    apstraktnu metodu koja vraca cenu skolarine.
//    apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//    metodu koja stampa podatke u formatu:
//    ime i prezime, broj indeksa, godina studija
//    Finansiranje: budzet/samofinansirajuci
//    Cena skolarine: cena


    protected String imePrezime;
    protected int brIndexa;
    protected int godineStudija;

    public Student (){}

    public Student(String imePrezime, int brIndexa, int godineStudija) {
        this.imePrezime = imePrezime;
        this.brIndexa = brIndexa;
        this.godineStudija = godineStudija;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getGodineStudija() {
        return godineStudija;
    }

    public void setGodineStudija(int godineStudija) {
        this.godineStudija = godineStudija;
    }

    public abstract int cenaSkolarine ();

    public abstract boolean daLiJeNaBudzetu ();

    public void stampaj (){
        System.out.println(this.imePrezime + ", " + this.brIndexa + ", " + this.godineStudija);
        System.out.println("Finansiranje: " + this.daLiJeNaBudzetu());
        System.out.println("Cena skolarine: " + this.cenaSkolarine());
    }
}
