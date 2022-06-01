package p30_05_2022;

import java.util.ArrayList;

public class History {
//    Klasu History koja ima:
//    niz stranica koje su posecene
//    metoda otvori stranicu koja dodaje novi historypage u niz.
//    metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//    metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//    metoda obrisi istoriju - metoda brise celu istoriju
//    metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//    metoda pogledajIstoriju - stampa sve posecene stranice
//    metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//    metoda obrisiSveKolaciceZaSadnjihSatVremena-
//    brise kolacice za strnaice koje su ucitane u zadnjih sat vremena.
//    Metoda kao parametar prima trenutno vreme (sat i minut)


    private ArrayList<HistoryPage> nizStranica = new ArrayList<>();

    public void otvoriStranicu (HistoryPage stranica){
        nizStranica.add(stranica);
    }

    public void obrisiPremaLinku(String link){
        for (int i = 0; i < this.nizStranica.size(); i++) {
            HistoryPage trenutnaStranica = nizStranica.get(i);
            if (trenutnaStranica.getLink().equals(link)){
                nizStranica.remove(i);
            }
        }
    }

    public void obrisiKolaciceZaLink(HistoryPage stranica){
        for (int i = 0; i < this.nizStranica.size(); i++) {
            HistoryPage trenutnaStranica = nizStranica.get(i);
            if (trenutnaStranica.getUsername().equals(stranica.getUsername()) &&
                trenutnaStranica.getPassword().equals(stranica.getPassword())) {
                trenutnaStranica.obrisiKolacice();
            }

        }
    }

    public void obrisiIstoriju (){
        nizStranica.clear();
    }

    public void sacuvajKredencijale (String nazivStranice, String username, String password){
        for (int i = 0; i < this.nizStranica.size(); i++) {
            HistoryPage trenutrnaStranica = nizStranica.get(i);
            if (trenutrnaStranica.getNazivStranice().equals(nazivStranice)){
                trenutrnaStranica.sacuvajKredencijale(username, password);
            }
        }
    }

    public void pogledajIstoriju (){
        for (int i = 0; i < this.nizStranica.size(); i++) {
            HistoryPage hp = this.nizStranica.get(i);
            hp.stampaj();
        }
        System.out.println("Trenutno prikazano: " + this.nizStranica.size() + " stranica.");
    }

    public void obrisiSveKolacice(){
        for (int i = 0; i < nizStranica.size(); i++) {
            HistoryPage trenutnaStranica = nizStranica.get(i);
            trenutnaStranica.obrisiKolacice();
        }
    }
    public void obrisiSveKolaciceZaSadnjihSatVremena(int trenutniSat, int trenutniMinut){
        for (int i = 0; i < nizStranica.size(); i++) {
            HistoryPage trenutnaStranica = nizStranica.get(i);
            if (trenutnaStranica.getSat() >= (trenutniSat - 1) &&
                    trenutnaStranica.getMinut() > trenutniMinut){
                trenutnaStranica.obrisiKolacice();
            }
        }
    }

}
