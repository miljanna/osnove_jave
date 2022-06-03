package p03_06_2022.zadatak3;

public abstract class Atleticar {
//    Kreirati apstraktnu klasu Atleticar čiji su tributi:
//    ime i prezime privatni
//    i rezultat ostvaren na takmičenju koji je zasticen
//    Javne metode klase su:
//    apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara
//    (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//    metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)

    private String imePrezime;
    protected int rezultatSaTakmicenja;

    public Atleticar(String imePrezime, int rezultatSaTakmicenja) {
        this.imePrezime = imePrezime;
        this.rezultatSaTakmicenja = rezultatSaTakmicenja;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getRezultatSaTakmicenja() {
        return rezultatSaTakmicenja;
    }

    public void setRezultatSaTakmicenja(int rezultatSaTakmicenja) {
        this.rezultatSaTakmicenja = rezultatSaTakmicenja;
    }

    public abstract boolean KojiJeAtleticarBolji (Atleticar atleticar);

    public void stampaj (Atleticar atleticar){
        System.out.println("Ime i prezime: " + this.imePrezime);
        System.out.println("Rezultat: " + this.rezultatSaTakmicenja);

    }

}
