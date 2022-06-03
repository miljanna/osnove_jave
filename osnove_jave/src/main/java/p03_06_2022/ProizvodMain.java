package p03_06_2022;

public class ProizvodMain {
    public static void main(String[] args) {
//        U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice.
//        Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati
//        ukupnu cenu porudzbine.

        Sastojak prvi = new Sastojak("kecap", 100);
        Sastojak drugi = new Sastojak("majonez", 150);
        Sastojak treci = new Sastojak("preliv od lesnika", 50);

        Pizza pica1 = new Pizza(50);
        Pizza pica2 = new Pizza(69);

        IcePoint casa = new IcePoint("vanila", true);
        IcePoint korent = new IcePoint("cokolada", false);

        pica1.ubaciDodatak(prvi);
        pica2.ubaciDodatak(drugi);
        pica2.ubaciDodatak(prvi);

        casa.ubaciDodatak(treci);
        casa.ubaciDodatak(treci);
        korent.ubaciDodatak(treci);

        pica1.stampaj();
        System.out.println();

        pica2.stampaj();
        System.out.println();

        casa.stampaj();
        System.out.println();

        korent.stampaj();



    }
}
