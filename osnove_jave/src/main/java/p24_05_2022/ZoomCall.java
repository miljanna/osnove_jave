package p24_05_2022;

public class ZoomCall {

    private String link;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall (String link, String password, Korisnik host, Korisnik guest){
        this.link = link;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }



    public String getLink() {
        return link;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public void pokreniPoziv (){
        System.out.println("Zoom call: " + this.link);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getImePrezime());
        System.out.println("Guest: " + this.guest.getImePrezime());
        System.out.println("Maksimalno trajanje minuta je: " + this.host.duzinaPoziva());
    }

}
