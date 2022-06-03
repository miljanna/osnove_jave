package p03_06_2022;

public class Sastojak {
//    Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
//    naziv dodatka
//    cenu dodatka
//    konstruktore, gettere i settere koji su vam potrebni
//    metodu stampaj koja stampa u formatu:
//            (dodatak)  (cena)

    private String sastojak;
    private int cena;

    public Sastojak(String sastojak, int cena) {
        this.sastojak = sastojak;
        this.cena = cena;
    }

    public String getSastojak() {
        return sastojak;
    }

    public void setSastojak(String sastojak) {
        this.sastojak = sastojak;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void stampaj (){
        System.out.println(this.sastojak + ", " + this.cena);
    }
}
