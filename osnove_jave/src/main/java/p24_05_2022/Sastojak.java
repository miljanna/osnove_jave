package p24_05_2022;

public class Sastojak {

    private String naziv;
    private int cena;

    public Sastojak (){}

    public Sastojak(String naziv, int cena){
        this.naziv = naziv;
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }


}
