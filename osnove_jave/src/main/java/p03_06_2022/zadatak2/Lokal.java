package p03_06_2022.zadatak2;

public class Lokal extends Objekat {
//    Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//    konstuktore
//    porez racuna po formuli koeficijent * povrsina * 1.3
//    prepisati metodu stampaj tako da stampa sve podatke vezane za lokal


    public Lokal(String adresa, int povrsinaObjekta, int zona) {
        super(adresa, povrsinaObjekta, zona);
    }

    @Override
    public double porezObjekta (){
        return this.koeficijentRacunanjaPoreza() * this.povrsinaObjekta * 1.3;
    }

    @Override
    public void stampaj (){
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina objekta: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Ukupan porez je: " + this.porezObjekta());
    }
}
