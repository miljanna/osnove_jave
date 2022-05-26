package d24_05_2022;

public class ZeleniKarton {

    private String imePrezimeStudenta;
    private int brIndexa;
    private String nazivPredmeta;
    private String imePrezimeProfesora;
    private int ocena;

    public ZeleniKarton(){
    }

    public ZeleniKarton(String imePrezimeStudenta, int brIndexa, String nazivPredmeta,
                        String imePrezimeProfesora, int ocena){
        this.imePrezimeStudenta = imePrezimeStudenta;
        this.brIndexa = brIndexa;
        this.nazivPredmeta = nazivPredmeta;
        this.imePrezimeProfesora = imePrezimeProfesora;
        this.ocena = ocena;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public int getOcena() {
        return ocena;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public String getImePrezimeStudenta() {
        return imePrezimeStudenta;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public void setImePrezimeStudenta(String imePrezimeStudenta) {
        this.imePrezimeStudenta = imePrezimeStudenta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean daLiJeIspitPolozen (){
        if (this.ocena > 5 && this.ocena <= 10){
            return true;
        }
        return false;
    }

    public void stampaj (){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.imePrezimeStudenta + ", " + this.brIndexa);
        System.out.println("Profesor: " + this.imePrezimeProfesora);
    }

//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//        Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
}
