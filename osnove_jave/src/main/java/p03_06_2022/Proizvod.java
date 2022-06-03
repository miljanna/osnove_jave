package p03_06_2022;

import java.util.ArrayList;

public abstract class Proizvod {
//    Kreirati abstraktnu klasu Proizvod koja ima:
//    niz dodataka
//    metodu ubaciDodatak koja dodaje dodatak u niz
//    metodu koja vraca cenu svih dodataka koje ima proizvod
//    abstraktnu metodu ukupnu racunaj cenu
//    abstraktnu metodu stampaj

    protected ArrayList <Sastojak> nizSastojaka = new ArrayList<>();

    public void ubaciDodatak (Sastojak sastojak){
        nizSastojaka.add(sastojak);
    }

    public int cenaSvihDodataka (){
        int cenaDodataka =0;
        for (int i = 0; i < this.nizSastojaka.size(); i++) {
            cenaDodataka += nizSastojaka.get(i).getCena();
        }
        return cenaDodataka;
    }

    public abstract int ukupnaCena ();

    public abstract void stampaj ();

}
