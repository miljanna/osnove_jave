package d18_05_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj (){
        System.out.println(this.naziv + ", " + this.cena + ", "+
                this.tezina);
    }

}
