package d03_06_2022;

import java.util.ArrayList;

public class Korpa {
//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//    kao parametar funkcije se prima Super karticu iz koje se cita popust.

    private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza ambalaza) {
        nizAmbalaza.add(ambalaza);
    }

    public ArrayList<Ambalaza> getNizAmbalaza() {
        return nizAmbalaza;
    }

    public void setNizAmbalaza(ArrayList<Ambalaza> nizAmbalaza) {
        this.nizAmbalaza = nizAmbalaza;
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            if (nizAmbalaza.get(i).equals(barkod)) {
                nizAmbalaza.remove(i);
            }
        }
    }

    private double cenaSvihAmbalaza(double popust) {
        double suma = 0;
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            suma += nizAmbalaza.get(i).cena();
        }
        return suma - popust;
    }
    public double ukupnaCenaKorpe(SuperKartica superKartica){
        double suma = 0;
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            suma += nizAmbalaza.get(i).cena();
        }
        return suma - superKartica.getPopust();
    }
}
