package d23_05_2022;

public class ProizvodVagaMAIN {
    public static void main(String[] args) {

//        Kreirati klasu Proizvod koja ima:
//        sifru proizvoda
//        naziv proizvoda
//        cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//        konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//        gettere i settere za sifru i naziv
//        setter za cenu po kilogramu
//        metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//        metodu getCenaLb koja vraca cenu za 1lb prozvoda
//        konverzija: 1 kg = 2.2046 lb
//        metodu koja stampa proizvod u formatu:
//        (sifra) - (naziv)
//
//        Kreirati klasu Vaga koja ima:
//        merna jedinica (kg ili lb)
//        proizvod (proizvod koji se meri)
//        TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//        default-ni konstuktor
//        getteri i setteri za sve atribute
//        metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu
//        (tezina je parametar funkcije). Na racunanje cene utice
//        i merna jedinica na koju je vaga podesena.
//        metodu stampaj koja stampa racun u formatu. POMOC: trebace vam
//        tezina kao parametar u ovoj metodi
//        (sifra) - (naziv)
//        (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
//        Ukupno: (ukupna cena)

        Proizvod prvi = new Proizvod("52", "banane", 120);
        Vaga merenje = new Vaga ();
        merenje.setMernaJed("kg");
        merenje.setProizvod(prvi);
        merenje.stampaj(10);
        System.out.println();


        Proizvod drugi = new Proizvod("000", "krompir", 50);
        Vaga merenje2 = new Vaga ();
        merenje2.setMernaJed("lb");
        merenje2.setProizvod(drugi);

        merenje2.stampaj(50);


    }
}
