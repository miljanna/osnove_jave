package p03_06_2022;

public class IcePoint extends Proizvod {
//    Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
//    tip sladoleda (vanila, cokolada)
//    atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
//    override uje metodu koja ukupnu cenu racuna:
//    ako je mali ice point na cenu svih dodataka doda 100
//    ako je veliki ice point cenu svih dodataka doda 130
//    override uje metodu stampaj da stampa sve podatke

    private String tipSladoleda;
    private boolean daLiJeMaliIcePoint;

    public IcePoint(String tipSladoleda, boolean daLiJeMaliIcePoint) {
        this.tipSladoleda = tipSladoleda;
        this.daLiJeMaliIcePoint = daLiJeMaliIcePoint;
    }


    public String getTipSladoleda() {
        return tipSladoleda;
    }

    public void setTipSladoleda(String tipSladoleda) {
        this.tipSladoleda = tipSladoleda;
    }

    public boolean isDaLiJeMaliIcePoint() {
        return daLiJeMaliIcePoint;
    }

    public void setDaLiJeMaliIcePoint (boolean daLiJeMaliIcePoint) {
        this.daLiJeMaliIcePoint = daLiJeMaliIcePoint;
    }

    @Override
    public int ukupnaCena (){
        if (daLiJeMaliIcePoint) {
            return this.cenaSvihDodataka() + 100;
        } else {
            return this.cenaSvihDodataka() + 130;
        }
    }

    @Override
    public void stampaj (){
        System.out.println("ICE POINT");
        for (int i = 0; i < nizSastojaka.size(); i++) {
            System.out.println(nizSastojaka.get(i).getSastojak() + ", " + nizSastojaka.get(i).getCena());
        }
        System.out.println("Tip sladoleda je: " + this.tipSladoleda);
        if (daLiJeMaliIcePoint){
            System.out.println("Ice point je mali.");
        } else {
            System.out.println("Ice point je veliki.");
        }
        System.out.println("Ukupna cena je: " + this.ukupnaCena());

    }


}
