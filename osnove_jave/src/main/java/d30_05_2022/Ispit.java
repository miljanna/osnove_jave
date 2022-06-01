package d30_05_2022;

public class Ispit {
//    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//    (naziv predmeta) - (profesor) - (ocena)

    private String nazivPredmeta;
    private double ocena;
    private String imePrezimeProfesor;

    public Ispit(){}

    public Ispit(String nazivPredmeta, int ocena, String imePrezimeProfesor) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imePrezimeProfesor = imePrezimeProfesor;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getImePrezimeProfesor() {
        return imePrezimeProfesor;
    }

    public void setImePrezimeProfesor(String imePrezimeProfesor) {
        this.imePrezimeProfesor = imePrezimeProfesor;
    }

    public boolean daLiJeIspitPolozen (){
        if (this.ocena >= 6 && this.ocena <=10 ){
            return true;
        }
        return false;
    }

    public void stampaj (){
        System.out.print(this.nazivPredmeta + " - " + this.imePrezimeProfesor + " - " + this.ocena);
    }
}
