package d02_06_2022;

import java.util.ArrayList;

public abstract class Radnik {
    //Kreirati abstraktnu klasu Radnik koja ima:
    // ime i prezime
    // niz sektora u kojima radi
    // abstraktnu metodu koja vraca platu radnika
    // metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

    protected String imeIprezime;
    protected ArrayList<Sektor> nizSektora = new ArrayList<>();
    public abstract double plataRadnika();
    public void zaposliUSektor (Sektor nazivSektora) {
        nizSektora.add(nazivSektora);
    }

    public Radnik(String imeIprezime) {
        this.imeIprezime = imeIprezime;

    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public ArrayList<Sektor> getNizSektora() {
        return nizSektora;
    }
}
