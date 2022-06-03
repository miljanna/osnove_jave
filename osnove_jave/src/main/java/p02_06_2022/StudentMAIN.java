package p02_06_2022;

public class StudentMAIN {
    public static void main(String[] args) {

        StudentOsnovnih osnovne = new StudentOsnovnih("Miljana Cvetkovic", 386, 6);
        osnovne.cenaSkolarine();
        osnovne.daLiJeNaBudzetu();
        osnovne.stampaj();

        StudentMaster master = new StudentMaster("Katarina Pesic", 385, 7);
        master.cenaSkolarine();
        master.daLiJeNaBudzetu();
        master.stampaj();

    }
}
