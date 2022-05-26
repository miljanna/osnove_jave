package d24_05_2022;

public class Transakcija {

    private String id;
    private Racun racunSaKogSePrenosi;
    private Racun racunNaKojiSePrenosi;

    public Transakcija(){
    }

    public Transakcija(String id, Racun racunSaKogSePrenosi, Racun racunNaKojiSePrenosi){
        this.id = id;
        this.racunSaKogSePrenosi = racunSaKogSePrenosi;
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    public Racun getRacunNaKojiSePrenosi() {
        return racunNaKojiSePrenosi;
    }

    public Racun getRacunSaKogSePrenosi() {
        return racunSaKogSePrenosi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRacunNaKojiSePrenosi(Racun racunNaKojiSePrenosi) {
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    public void setRacunSaKogSePrenosi(Racun racunSaKogSePrenosi) {
        this.racunSaKogSePrenosi = racunSaKogSePrenosi;
    }

    private double vracanjeProvizije (double visinaTransakcije){
        if (visinaTransakcije < 4500){
            return visinaTransakcije - (visinaTransakcije - 45);
        } else {
            return visinaTransakcije - (visinaTransakcije / 100);
        }
    }


    public void izvrsiTransakciju (int visinaTransakcije){
        if (this.getRacunNaKojiSePrenosi().getTrenutnoStanje() >0){
            this.racunSaKogSePrenosi.menjanjeStanja(visinaTransakcije * -1 - vracanjeProvizije(visinaTransakcije));
            this.racunNaKojiSePrenosi.menjanjeStanja(visinaTransakcije);
        } else {
            System.out.println("Nemate dovoljno sredstava!");
        }
    }

    public void stampaj (){
        System.out.println(this.id);
        System.out.println("Racun sa: " + this.getRacunSaKogSePrenosi().getImePrezime() + " - " +
                this.getRacunSaKogSePrenosi().getBroj());
        System.out.println("Racun na: " + this.getRacunNaKojiSePrenosi().getImePrezime() + " - " +
                this.getRacunNaKojiSePrenosi().getBroj());
    }

}
