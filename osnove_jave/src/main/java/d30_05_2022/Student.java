package d30_05_2022;

import java.util.ArrayList;

public class Student {
//    Napisati klasu Student koja ima
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//    (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//    (naziv predmeta) - (profesor) - (ocena)
//    (naziv predmeta) - (profesor) - (ocena)
//    (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)

    private int brojIndexa;
    private String imePrezime;
    private String tipStudija;
    private ArrayList<Ispit> nizIspita = new ArrayList<>();

    public Student (){}

    public Student (int brojIndexa, String imePrezime, String tipStudija){
        this.brojIndexa = brojIndexa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getNizIspita() {
        return nizIspita;
    }

    public void dodajIspit (Ispit ispit){
        nizIspita.add(ispit);
    }

    public double prosekNaStudijama (){
        double prosek = 0;
        for (int i = 0; i < this.nizIspita.size(); i++) {
            if (this.nizIspita.get(i).daLiJeIspitPolozen()){
                prosek = prosek + this.nizIspita.get(i).getOcena();
            }
        }

        return prosek / this.nizIspita.size();
    }

    public void stampaj (){
        System.out.println(this.brojIndexa + " - " + this.imePrezime + " - " + this.tipStudija);
        System.out.println("Predmeti: ");

        for (int i = 0; i < this.nizIspita.size(); i++) {
            System.out.println(this.nizIspita.get(i).getNazivPredmeta() + " - " +
                             this.nizIspita.get(i).getImePrezimeProfesor() + " - " +
                             this.nizIspita.get(i).getOcena());
        }

        System.out.println("Prosecna ocena je: " + prosekNaStudijama());
    }

}
//    metodu stampaj koja stampa u formatu:
//    (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//    (naziv predmeta) - (profesor) - (ocena)
//    (naziv predmeta) - (profesor) - (ocena)
//    (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)