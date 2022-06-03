package p03_06_2022;

public class Pizza extends Proizvod{
//    Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
//    cena podloge
//    override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
//    override uje metodu stampaj da stampa sve podatke

    private int cenaPodloge;

    public Pizza(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    public int getCenaPodloge() {
        return cenaPodloge;
    }

    public void setCenaPodloge(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public int ukupnaCena (){
        return this.cenaSvihDodataka() + this.cenaPodloge;
    }

    @Override
    public void stampaj (){
        System.out.println("PIZZA");
        for (int i = 0; i < nizSastojaka.size(); i++) {
            System.out.println(nizSastojaka.get(i).getSastojak() + ", " + nizSastojaka.get(i).getCena());
        }
        System.out.println("Cena podloge je: " + this.cenaPodloge);
        System.out.println("Ukupna cena je: " + this.ukupnaCena());
    }
}
