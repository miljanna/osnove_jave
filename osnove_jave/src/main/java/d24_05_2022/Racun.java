package d24_05_2022;

public class Racun {

    private String broj;
    private String imePrezime;
    private double trenutnoStanje;

    public Racun (){}

    public Racun (String broj, String imePrezime, int trenutnoStanje){
        this.broj = broj;
        this.imePrezime = imePrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public String getBroj() {
        return broj;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public boolean menjanjeStanja (double promena){
        if (this.trenutnoStanje + promena > 0){
            trenutnoStanje = trenutnoStanje + promena;
            return true;
        } else {
            trenutnoStanje = trenutnoStanje;
            return false;

        }
    }

    public void stampaj (){
        System.out.println(this.imePrezime + " - " + this.broj);
        System.out.println("Stanje na racunu je: " + this.getTrenutnoStanje() + " rsd.");
    }

}
