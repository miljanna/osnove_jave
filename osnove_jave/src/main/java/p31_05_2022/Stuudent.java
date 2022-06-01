package p31_05_2022;

public class Stuudent extends Osoba{
//    Kreirati klasu Student koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    broj indeksa
//    dug za skolarinu
//    konstuktor sa parametrima
//    metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost.
//    Metoda prima iznos uplate kao parametar metode.
//    Napisati implementaciju metode stampaj da stampa sve podatke o studentu

    private int brIndexa;
    private int dug;

    public Stuudent (int brIndexa, int dug, String imePrezime, String jmbg){
        super(imePrezime, jmbg);
        this.brIndexa = brIndexa;
        this.dug = dug;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getDug() {
        return dug;
    }

    public void setDug(int dug) {
        this.dug = dug;
    }

    public void uplatiSkolarinu (int iznosUplate){
        this.dug = this.dug - iznosUplate;
        if (this.dug < 0){
            this.dug = 0;
        }
    }

    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Broj indexa je: " + this.brIndexa + ", " + "a dug je " + this.dug);
    }
}
