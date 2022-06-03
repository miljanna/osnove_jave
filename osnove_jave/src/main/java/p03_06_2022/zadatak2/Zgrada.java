package p03_06_2022.zadatak2;

public class Zgrada extends Objekat {
//    Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//    broj stanova
//    konstuktore, gettere i setter
//    porez racuna po formuli koeficijent * povrsina * broj stanova
//    prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu

    private int brojStanova;

    public Zgrada(String adresa, int povrsinaObjekta, int zona, int brojStanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double porezObjekta (){
        return this.koeficijentRacunanjaPoreza() * this.povrsinaObjekta * this.brojStanova;
    }

    @Override
    public void stampaj (){
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina objekta: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona + " a broj stanova je: " + this.brojStanova);
        System.out.println("Ukupan porez je: " + this.porezObjekta());
    }
}
