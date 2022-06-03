package p02_06_2022.drugi_zadatak;

public class MasterKartica extends PlatnaKartica {
//    Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//    konstruktor sa parametrima
//    implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//    metoda naplatiOdrzavanje, koja sa racuna skida $2.
//    implementira metodu koja stampa podatke o kartici u formatu:
//    Master Card: 12/2019, 4012-1239-1221-3381, $232
//    u main funkciji, napraviti visa i master kartice i testirati funkcije

    public MasterKartica(int suma, String brojKartice, int godinaVazenja, int mesec) {
        super(suma, brojKartice, godinaVazenja, mesec);
    }

    public void naplatiOdrzavanje (){

        this.suma = this.suma - 2;
    }

    @Override
    public void izvrsiTransakciju (int oduzeto) {
        int provizija = this.suma * 15 / 1000;

        this.suma = this.suma - oduzeto - provizija;
    }

    @Override
    public void stampaj (){
        System.out.print("Master card: " + this.brojKartice + ", " + this.godinaVazenja + ", " + "$" + this.suma);
    }

    }
