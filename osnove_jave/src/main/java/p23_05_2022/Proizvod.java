package p23_05_2022;

public class Proizvod {

    private String naziv;
    private String musterija;
    private int cena;
    private Kupac informacije;


    public Proizvod (){

    }

    public Proizvod (String naziv, String musterija, int cena, Kupac informacije){
        this.naziv = naziv;
        this.musterija = musterija;
        this.cena = cena;
        this.informacije = informacije;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getMusterija() {
        return musterija;
    }

    public int getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setMusterija(String musterija) {
        this.musterija = musterija;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public double cenaProizvoda (){
        return getCena() * 1.9 * (100 - this.informacije.getClanskaKarta().getPopust())/100;
    }

    public void stampaj (){
        System.out.println(this.naziv + " - " + cenaProizvoda());
        this.informacije.stampaj();
    }
}
