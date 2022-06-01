package p30_05_2022;

import java.util.ArrayList;

public class FacePost {
//    Kreirati klasu FacebookPost koja ima:
//    ime i prezime korisnika koji je stavio oglas
//    tekst objave
//    niz reakcija
//    metodu reaguj, koja dodaje reakciju u niz
//    (modifikacija za vezbu)
//    Ukoliko se desi situacija da jedan isti korisnik reaguje na post
//    (tj. postoji rekacija korisnika sa istim imenom i prezimenom)
//    izbaciti prethodnu reakciju i uracunati novu.
//    Primer: Milan - lajkuje
//    Nemanja - lajkuje
//    Milan - daje srce
//    Post ima lajk od Nemanje i srce od Milana.
//    privatnu metodu koja vraca broj reakcija odredjenog tipa
//    (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//    metodu stampaj koja stampa podatke u formatu:
//    ime i prezime
//    tekst objave
//    Smajli 10 | Like 15 | Srce 2


    private String imePrezimeDaoOglas;
    private String tekst;

    private ArrayList<Reakcija> nizReakcija = new ArrayList<>();

    public FacePost (){
    }

    public FacePost (String imePrezimeDaoOglas, String tekst){
        this.imePrezimeDaoOglas = imePrezimeDaoOglas;
        this.tekst = tekst;
    }

    public String getImePrezimeDaoOglas() {
        return imePrezimeDaoOglas;
    }

    public void setImePrezimeDaoOglas(String imePrezimeDaoOglas) {
        this.imePrezimeDaoOglas = imePrezimeDaoOglas;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public void reaguj (Reakcija reakcija) {
        for (int i = 0; i < this.nizReakcija.size(); i++) {
            Reakcija prethodnaReakcija = nizReakcija.get(i);

            if (prethodnaReakcija.getImePrezime().equals(reakcija.getImePrezime())) {
                nizReakcija.remove(i);
            }
        }
        nizReakcija.add(reakcija);
    }

    private int brojReakcija (String reakcija){
            int brojac = 0;

        for (int i = 0; i < this.nizReakcija.size(); i++) {
            if (reakcija.equals(nizReakcija.get(i).getReakcija())){
                brojac ++;
            }
        }

        return brojac;
    }

    public void stampaj(){
        System.out.println(this.imePrezimeDaoOglas);
        System.out.println(this.tekst);

        int smajli = brojReakcija("smajli");
        int srce = brojReakcija("srce");
        int lajk = brojReakcija("lajk");

        System.out.println("Smajli " + smajli + " | " + "Srce " + srce + " | " + "Lajk " + lajk);
    }


}
