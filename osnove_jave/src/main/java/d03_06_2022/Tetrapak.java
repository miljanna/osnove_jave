package d03_06_2022;

public class Tetrapak extends Ambalaza{
//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
//    metoda stampaj stampa sve podatke iz klase tetrapak.
//    metoda stampaj stampa sve podatke iz klase tetrapak.
    private boolean recikliraSe;
    private double osnovnaCena;

    public Tetrapak(String barkod, String naziv, double neto, double bruto, boolean recikliraSe, double osnovnaCena) {
        super(barkod, naziv, neto, bruto);
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isRecikliraSe() {
        return recikliraSe;
    }

    public void setRecikliraSe(boolean recikliraSe) {
        this.recikliraSe = recikliraSe;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cena(){
        if (recikliraSe){
            return this.izracunajTezinu() * 1.5 + this.osnovnaCena;
        }else {
            return this.osnovnaCena;
        }
    }
    @Override
    public void stampaj(){
        System.out.println("Naziv: " + this.naziv + " Barkod: " + this.barkod + " Cena: " + cena());
    }
}
