package p30_05_2022;

public class SastojakPastaMAIN {
    public static void main(String[] args) {

        Sastojak nula = new Sastojak("Gauda", 350);
        Sastojak jedan = new Sastojak("Pene", 120);
        Sastojak dva = new Sastojak("Mocarela",200);
        Sastojak tri = new Sastojak("Pesto", 400);

        Pasta pastaBar = new Pasta();
        pastaBar.dodajSastojak(nula);
        pastaBar.dodajSastojak(jedan);
        pastaBar.dodajSastojak(dva);
        pastaBar.dodajSastojak(tri);
        pastaBar.dodajSastojak(nula);
        pastaBar.dodajSastojak(nula);
        pastaBar.brisiSastojak(nula);

        pastaBar.stampaj();
    }
}
