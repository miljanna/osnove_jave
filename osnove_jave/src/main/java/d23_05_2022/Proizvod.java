package d23_05_2022;

public class Proizvod {

    private String sifra;
    private String naziv;
    private double cenaPoKG;

    public Proizvod (String sifra, String naziv, double cenaPoKG){
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKG = cenaPoKG;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getSifra() {
        return sifra;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void setCenaPoKG(int cenaPoKG) {
        this.cenaPoKG = cenaPoKG;
    }

    public double getCenaKG (){
        return this.cenaPoKG;
    }

    public double getCenaLB (){
        return cenaPoKG * 2.2046;
    }

    public void stampaj (){
        System.out.println(this.sifra + " - " + this.naziv);
    }
}
