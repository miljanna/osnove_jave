package d30_05_2022;

public class StudentIspitMAIN {
    public static void main(String[] args) {

        Ispit gis = new Ispit("GIS", 9, "Milan Djordjevic");
        Ispit politicka = new Ispit("Politicka geografija", 10, "Ranko Dragovic");
        Ispit stanovnistvo = new Ispit("Stanovnistvo sveta", 8, "Selim Sacirovic");
        Ispit turisticka = new Ispit("Turisticka geografija", 6, "Marija Bratic");

        Student jedan = new Student(386, "Miljana Cvetkovic", "master");
        jedan.dodajIspit(gis);
        jedan.dodajIspit(politicka);
        jedan.dodajIspit(stanovnistvo);
        jedan.dodajIspit(turisticka);
        jedan.stampaj();


    }
}
