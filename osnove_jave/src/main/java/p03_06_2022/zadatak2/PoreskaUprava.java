package p03_06_2022.zadatak2;

import java.util.ArrayList;

public class PoreskaUprava {
//    Kreirati klasu PoreskaUprava koja za atribute ima:
//    ime grada u kom se nalazi
//    niz objekata
//    metodu dodaj objekat
//    metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//    metodu koja vraca objekat sa najmanjim porezom
//    metodu koja racuna ukupan porez za ceo grad
//    metodu koja stampa sve objekte

    private String imeGrada;
    private ArrayList<Objekat> nizObjekta = new ArrayList<>();

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public void dodajObjekat (Objekat objekat){
        nizObjekta.add(objekat);
    }

    public double ukupanPorez (){
        double ukupanPorezObjekata = 0;

        for (int i = 0; i < this.nizObjekta.size(); i++) {
            ukupanPorezObjekata += this.nizObjekta.get(i).porezObjekta();
        }

        return ukupanPorezObjekata;
    }

    public void stampaj (){
        for (int i = 0; i < this.nizObjekta.size(); i++) {
            System.out.println("Adresa: " + this.nizObjekta.get(i).getAdresa());
            System.out.println("Povrsina objekta: " + this.nizObjekta.get(i).getPovrsinaObjekta());
            System.out.println("Zona: " + this.nizObjekta.get(i).getZona());
        }
        System.out.println("Ukupan porez je: " + this.ukupanPorez());

    }
}
