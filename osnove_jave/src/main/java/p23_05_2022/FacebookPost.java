package p23_05_2022;

public class FacebookPost {

    private String opis;
    private Korisnik autor;

    public FacebookPost (){

    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public Korisnik getAutor (){
        return this.autor;
    }

    public void setKorisnik (Korisnik autor){
        this.autor = autor;
    }

    public void stampaj (){
        System.out.println("Tekst poruke je: " + this.opis);
        System.out.println("Ime je " + this.autor.getIme());
        System.out.println("Prezime je " + this.autor.getPrezime());
    }
}
