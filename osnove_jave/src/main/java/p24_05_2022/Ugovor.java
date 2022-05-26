package p24_05_2022;

public class Ugovor {

    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;

    public Ugovor(){}

    public Ugovor (String datum, int cena, String adresa, FizickoLice prodavac){
        this.datum = datum;
        this.cena = cena;
        this.adresa = adresa;
        this.prodavac = prodavac;
    }

    public int getCena() {
        return cena;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getDatum() {
        return datum;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setKupac(FizickoLice kupac) {
        this.kupac = kupac;
    }

    public double procenatZarade (){
        if (this.kupac.isDaLiJeKupovaoRanije() == true){
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public double zaradaAgencije (){
        return 1000 + this.cena * procenatZarade();
    }

    public void stampaj (){
        System.out.println("Dana " + this.datum + " god sklopljen je ugovor izmedju "
                         + this.prodavac.getImePrezime() + " i ");
        System.out.println(this.kupac.getImePrezime() + " o kupovini nekretnine " + this.adresa +
                           " po ceni od " + this.cena);
        System.out.println("pri cemu je kupac u obavezi da agenciji isplati " +
                           "novcanu vrednost u iznosu " + this.zaradaAgencije());

    }

    //        Kreirati klasu Ugovor koja ima:
//        godinu, dan i mesec sklapanja ugovora
//        osobu koja prodaje nekretninu (fizicko lice)
//        osobu koja kupuje nekretninu (fizicko lice)
//        cenu za koju se prodaje nekretnina
//        adresu nekretnine (ulica br., grad)
//        metodu koja vraca procenat zarade
//        za osobu koja je vec kupovale nekretninu preko agencije
//        je 0.02 dok je za one koji nisu 0.03
//        metodu koja racuna zaradu agencije pri prodaji nekretninte
//        koja ukljucujei poreze, takse i usluge agencije, prema formuli:
//        1000 + cena za koju se prodaje * procenat zarade
//        metodu koja stampa ugovor u formatu:
//        Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca)
//        i (print kupca) o kupovini nekretnine (adresa) po ceni od (cena nekretnin)
//        pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu
//        od (zarada agencije)
}
