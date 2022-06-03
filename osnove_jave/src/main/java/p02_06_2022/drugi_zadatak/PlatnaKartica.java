package p02_06_2022.drugi_zadatak;

public abstract class PlatnaKartica {
//    Napraviti klasu apstraktnu PlatnaKartica koja ima
//    atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//    atribut broj kartice  primer: 4012-1239-1221-3381
//    atribut godina - godina do kada vazi kartica
//    atribut mesec-  mesec do kada vazi kartica
//    konstruktor sa parametrima
//    gettere za sve atribute, bez settera
//    metodu dodajSredstva koja povecava sumu za unetu vrednost
//    apstraktnu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//    apstraktnu metodu koja stampa podatke o kartici.


    protected int suma;
    protected String brojKartice;
    protected int godinaVazenja;
    protected int mesec;

    public PlatnaKartica(int suma, String brojKartice, int godinaVazenja, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaVazenja = godinaVazenja;
        this.mesec = mesec;
    }

    public int getSuma() {

        return suma;
    }

    public String getBrojKartice() {

        return brojKartice;
    }

    public int getGodinaVazenja() {

        return godinaVazenja;
    }

    public int getMesec() {

        return mesec;
    }

    public void dodajSredstva(int unesiIznos){

        this.suma = this.suma + unesiIznos;
    }

    public abstract void izvrsiTransakciju (int oduzeto);

    public abstract void stampaj ();
}
