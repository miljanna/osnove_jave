package p24_05_2022;

public class FizickoLice {

    private String imePrezime;
    private String licnaKarta;
    private String jmbg;
    private boolean daLiJeKupovaoRanije;

    public FizickoLice(){}

    public FizickoLice(String imePrezime, String licnaKarta, boolean daLiJeKupovaoRanije, String jmbg){
        this.imePrezime = imePrezime;
        this.licnaKarta = licnaKarta;
        this.daLiJeKupovaoRanije = daLiJeKupovaoRanije;
        this.jmbg = jmbg;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public String getLicnaKarta() {
        return licnaKarta;
    }

    public boolean isDaLiJeKupovaoRanije() {
        return daLiJeKupovaoRanije;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setLicnaKarta(String licnaKarta) {
        this.licnaKarta = licnaKarta;
    }

    public void setDaLiJeKupovaoRanije(boolean daLiJeKupovaoRanije) {
        this.daLiJeKupovaoRanije = daLiJeKupovaoRanije;
    }

    public void stampaj (){
        System.out.println(this.imePrezime + ", " + this.licnaKarta);
    }
//        Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//        ime i prezime
//        broj licne karte
//        jmbg
//        podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//        konstuktore
//        gettere i settere, jmbg ne sme da se menja
//        metodu stampaj, koja stmpa podatke u formatu:
//        ime i prezime, broj licne karte
}
