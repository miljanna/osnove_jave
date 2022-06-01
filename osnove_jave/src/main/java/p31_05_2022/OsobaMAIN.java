package p31_05_2022;

public class OsobaMAIN {
    public static void main(String[] args) {

        Stuudent prvi = new Stuudent(386,20000, "Miljana Cvetkovic", "545646556");
        Stuudent drugi = new Stuudent(385,30000, "Katarina Pesic", "545644444");

        prvi.uplatiSkolarinu(10000);
        drugi.uplatiSkolarinu(30000);

        prvi.stampaj();
        System.out.println();
        drugi.stampaj();
        System.out.println();

        Profesor brojJedan = new Profesor("Geografija", 50000,
                "Milan Djordjevic", "54765748");
        Profesor brojDva = new Profesor("GIS", 50000,
                "Milan Jovanovic", "54755558");

        brojJedan.povecajPlatu(10);
        brojDva.povecajPlatu(20);

        brojJedan.stampaj();
        System.out.println();
        brojDva.stampaj();



    }
}
