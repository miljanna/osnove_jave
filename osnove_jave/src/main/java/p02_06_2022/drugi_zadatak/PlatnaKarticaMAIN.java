package p02_06_2022.drugi_zadatak;


public class PlatnaKarticaMAIN {
    public static void main(String[] args) {

        VisaKartica visa = new VisaKartica(20000,"777-777-888",
                2023, 12, "Miljana Cvetkovic");
        visa.izvrsiTransakciju(10000);
        visa.stampaj();
        System.out.println();

        MasterKartica master = new MasterKartica(50000, "7777-888-888",
                2025, 8);
        master.izvrsiTransakciju(20000);
        master.naplatiOdrzavanje();
        master.stampaj();

    }
}
