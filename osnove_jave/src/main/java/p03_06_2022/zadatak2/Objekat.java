package p03_06_2022.zadatak2;

public abstract class Objekat {
//    Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi:
//    adresa (ulica i broj)
//    povrsina objekta
//    zona (1, 2 ili 3)
//    konstuktore, gettere i settere
//    metodu koja vraca koeficijent koji ce se koristiti za
//    racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//    zona 1, koeficijent je 1.4
//    zona 2, koeficijent je 1.1
//    zona 3, koeficijent je 1.05
//    abstraktnu metodu koja racuna i vraca porez objekta
//    abstraktnu metodu stampa

    protected String adresa;
    protected int povrsinaObjekta;
    protected int zona;

    public Objekat(String adresa, int povrsinaObjekta, int zona) {
        this.adresa = adresa;
        this.povrsinaObjekta = povrsinaObjekta;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getPovrsinaObjekta() {
        return povrsinaObjekta;
    }

    public void setPovrsinaObjekta(int povrsinaObjekta) {
        this.povrsinaObjekta = povrsinaObjekta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficijentRacunanjaPoreza (){
        if (this.zona == 1){
            return 1.4;
        } else if (this.zona == 2){
            return 1.1;
        } else if (this.zona == 3){
            return 1.05;
        }
        return 0;
    }

    public abstract double porezObjekta ();

    public abstract void stampaj ();
}
