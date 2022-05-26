package p24_05_2022;

public class Korisnik {

    private String imePrezime;
    private String tipLicence;

    public Korisnik (String imePrezime){
        this.imePrezime = imePrezime;
        this.tipLicence = "basic";
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getTipLicence() {
        return tipLicence;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void pretplatiSe (int uplata){
        if (uplata == 100){
            this.tipLicence = "pro";
        } else if (uplata == 150){
            this.tipLicence = "premium";
        }
    }

    public void ponistiPretplatu (){
       this.tipLicence = "basic";
    }

    public int duzinaPoziva (){
        if (this.tipLicence.equals("basic")){
            return 40;
        } else if (this.tipLicence.equals("pro")){
            return 240;
        } else if (this.tipLicence.equals("premium")){
            return 1440;
        }
        return 0;
    }

    public void stampaj (){
        System.out.println(this.imePrezime);
    }

}
