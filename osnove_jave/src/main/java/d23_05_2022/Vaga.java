package d23_05_2022;

public class Vaga {

    private String mernaJed;
    private Proizvod proizvod;


    public String getMernaJed() {
        return mernaJed;
    }

    public void setMernaJed(String mernaJed) {
        this.mernaJed = mernaJed;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double sracunajCenu (double unesiTezinu){
        if (this.mernaJed.equals("kg")){
            return this.proizvod.getCenaKG() * unesiTezinu;
        } else if (this.mernaJed.equals("lb")){
            return this.proizvod.getCenaLB() * unesiTezinu;
        }
        return 0;
    }

    public void stampaj (double unesiTezinu){
        System.out.println(this.proizvod.getSifra() + " - " + this.proizvod.getNaziv());

        if (this.mernaJed.equals("kg")){
            System.out.println(this.proizvod.getCenaKG() + " kg x " + unesiTezinu);
        } else if (this.mernaJed.equals("lb")){
            System.out.println(this.proizvod.getCenaLB() + " lb x " + unesiTezinu);
        }

        System.out.println("Ukupna cena je: " + sracunajCenu(unesiTezinu));
    }

}
