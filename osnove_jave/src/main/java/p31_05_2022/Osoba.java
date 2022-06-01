package p31_05_2022;

public class Osoba {
//    Kreirati klasu Osoba koja od atributa ima:
//    ime i prezime
//            jmbg
//    konstuktor sa parametrima
//    metodu stampaj koja stampa podatke u formatu
//    ime prezime, jmbg

    protected String imePrezime;
    protected String jmbg;

    public Osoba (String imePrezime, String jmbg){
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void stampaj (){
        System.out.println(this.imePrezime + ", " + this.jmbg);
    }

}
