package d23_05_2022;

public class Knjiga {

    private String isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga (){

    }

    public Knjiga (String isbn, String naziv, int godinaIzdanja, Autor autor){
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampaj (){
        System.out.println("ISBN broj je: " + this.isbn);
        System.out.println(this.naziv + " - " + this.godinaIzdanja);
        System.out.println(this.autor.getImePrezime());
    }
}
