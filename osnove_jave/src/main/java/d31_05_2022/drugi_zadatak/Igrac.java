package d31_05_2022.drugi_zadatak;

import java.util.ArrayList;

public class Igrac extends Osoba {
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    niz kartona
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu dodaj karton, gde se dodaje karton u niz
//    metodu koja vraca broj zutih kartona
//    metodu koja vraca broj crvenih kartona
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    private int brojDresa;
    private String pozicija;
    private ArrayList <Karton> nizKartona = new ArrayList<>();
    private boolean kapiten;

    public Igrac () {}


    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int brojDresa,
                 String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void dodajKarton (Karton karton){
        nizKartona.add(karton);
    }

    public int izbrojiKartone (String tipKartona){
        int brojac = 0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals(tipKartona)){
                brojac++;
            }
        }
        return brojac;
    }


    @Override
    public void stampaj () {
        if (kapiten) {
            super.stampaj();
            System.out.println("Ovaj igrac je kapiten.");
            System.out.println("Broj zutih kartona je: " + this.izbrojiKartone("zuti"));
            System.out.println("Broj crvenih kartona je: " + this.izbrojiKartone("crveni"));
            System.out.println("Broj dresa je: " + this.brojDresa);
            System.out.println("Pozicija je: " + this.pozicija);
        } else {
            super.stampaj();
            System.out.println("Ovaj igrac nije kapiten.");
            System.out.println("Broj zutih kartona je: " + this.izbrojiKartone("zuti"));
            System.out.println("Broj crvenih kartona je: " + this.izbrojiKartone("crveni"));
            System.out.println("Broj dresa je: " + this.brojDresa);
            System.out.println("Pozicija je: " + this.pozicija);
        }
    }

}
