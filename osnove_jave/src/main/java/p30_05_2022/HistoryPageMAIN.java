package p30_05_2022;

public class HistoryPageMAIN {
    public static void main(String[] args) {
        HistoryPage stranica1 = new HistoryPage("Kolaci", "link1",
                                                15, 20, "Miljana", "Cvetkovic");
        HistoryPage stranica2 = new HistoryPage("Perece", "link2",
                                                13, 58, "Milan", "Jovanovic");
        HistoryPage stranica3 = new HistoryPage("Pivo", "link3",
                                                14, 56, "Laza", "Lazic");

        History history = new History();
        history.otvoriStranicu(stranica1);
        history.otvoriStranicu(stranica2);
        history.otvoriStranicu(stranica3);

        history.pogledajIstoriju();
//        history.obrisiIstoriju();
//        history.pogledajIstoriju();
        history.obrisiKolaciceZaLink(stranica1);
        history.pogledajIstoriju();

        history.obrisiSveKolaciceZaSadnjihSatVremena(15,5);
        history.pogledajIstoriju();

        history.obrisiSveKolacice();
        history.pogledajIstoriju();
    }
}
