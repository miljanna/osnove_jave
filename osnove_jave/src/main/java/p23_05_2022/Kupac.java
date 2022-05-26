package p23_05_2022;

public class Kupac {

    private String imePrezime;

    private Kartica kartica;

    public Kupac (){

    }

    public Kupac (String imePrezime, int clanskaKarta, Kartica kartica){
        this.imePrezime = imePrezime;
        this.kartica = kartica;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public Kartica getClanskaKarta() {
        return kartica;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void stampaj (){
        System.out.println(this.imePrezime + " - " + this.kartica.getBrojKartice());
    }

}
