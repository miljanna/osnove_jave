package p03_06_2022.zadatak2;

public class Kuca extends Objekat {
//    Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//    konstuktore, gettere i setter
//    porez racuna po formuli: koeficijent * povrsina.
//    prepisati metodu stampaj tako da stampa sve podatke vezane za kucu

    private int brojClanova;

    public Kuca(String adresa, int povrsinaObjekta, int zona, int brojClanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double porezObjekta (){
        return this.koeficijentRacunanjaPoreza() * povrsinaObjekta;
    }

    @Override
    public void stampaj (){
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina objekta: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona + ", a broj clanova: " + this.brojClanova);
        System.out.println("Ukupan porez je: " + this.porezObjekta());
    }
}
