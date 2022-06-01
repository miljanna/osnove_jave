package p30_05_2022;

import javax.management.remote.rmi.RMIConnectionImpl;

public class HistoryPage {

//    Klasu HistoryPage koja ima:
//    naziv stranice
//    link do stranice
//    vreme otvaranja stranice - sat i minut (2 atributa)
//    username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
//    konstuktore koji su logicni
//    gettere i setter (username i password nemaju settere)
//    metodu sacuvaj kredencijale za ovu stranicu.
//    Metoda kao parametre  prima username i password i setuje te atribute.
//    Metoda obrisi kolacice koja setuje username i password na null.
//    Metoda stampaj koja stampa podatke u formatu:
//    [sat] - [minut] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]


    private String nazivStranice;
    private String link;
    private int sat;
    private int minut;
    private String username;
    private String password;

    public HistoryPage (){}

    public HistoryPage (String nazivStranice, String link, int sat, int minut, String username, String password){
        this.nazivStranice = nazivStranice;
        this.link = link;
        this.sat = sat;
        this.minut = minut;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNazivStranice() {
        return nazivStranice;
    }

    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        this.minut = minut;
    }

    public void sacuvajKredencijale (String username, String password){
        this.username = username;
        this.password = password;
    }

    public void obrisiKolacice (){
        this.username = null;
        this.password = null;
    }

    public void stampaj (){
        String kredencijali = "";

        if (this.username != null && this.password != null) {
          kredencijali = "***";
        }
        System.out.print(this.sat + ":" + this.minut + " - " + this.nazivStranice + " ... ");
        System.out.println(this.link + " " + kredencijali);
    }
}
