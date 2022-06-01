package p31_05_2022;

public class Profesor extends Osoba {
//    Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    naziv predmeta koji predaje
//    iznos plate
//    konstuktor sa parametrima
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati implementaciju metode stampaj da stampa sve podatke o profesoru

    private String nazivPredmeta;
    private int iznosPlate;

    public Profesor (String nazivPredmeta, int iznosPlate, String imePrezime, String jmbg){
        super (imePrezime, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getIznosPlate() {
        return iznosPlate;
    }

    public void setIznosPlate(int iznosPlate) {
        this.iznosPlate = iznosPlate;
    }

    public void povecajPlatu (int procenatPovecanja){
        this.iznosPlate = this.iznosPlate + (this.iznosPlate * procenatPovecanja/100);
    }

    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Predmet: " + this.nazivPredmeta + ", " + "plata je " + this.iznosPlate);
    }
}
