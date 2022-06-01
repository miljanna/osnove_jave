package p31_05_2022.drugi_zadatak;

public class VisaKartica extends PlatnaKartica{
//    Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
//    ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//    getter i setter za ovlasceno lice
//    konstruktor sa parametrima
//    implementira metodu izvrsiTransakciju,  tako da na
//    prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
//    implementira metodu koja stampa podatke o kartici u formatu:
//    Visa Card: 4012-1239-1221-3381, 11/2019, $212

    private String ovlascenoLice;

    public VisaKartica(int suma, String brojKartice, int godinaVazenja, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godinaVazenja, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju (int oduzeto){
        int provizija = this.suma * 18/1000;

        if (provizija < 4) {
            provizija = 4;
        }
        this.suma = this.suma - oduzeto - provizija;
    }

    @Override
    public void stampaj (){
        System.out.print("Visa card: ");
        super.stampaj();
    }
}
