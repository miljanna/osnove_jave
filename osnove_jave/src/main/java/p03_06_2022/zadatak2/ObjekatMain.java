package p03_06_2022.zadatak2;

public class ObjekatMain {
    public static void main(String[] args) {
//        U glavnom programu napraviti jednu poresku upravu i u nju
//        dodati minimum 3 razlicita objekta i istestirati sve metode.

        PoreskaUprava grad1 = new PoreskaUprava("Leskovac");
        PoreskaUprava grad2 = new PoreskaUprava("Nis");

        Objekat prvi = new Kuca ("Nikole Skobaljica 15", 256, 2, 5);
        Objekat drugi = new Zgrada("Mose Pijade 1", 200, 1, 4);
        Objekat treci = new Lokal ("Ilije Strele 11", 100, 2);

        grad1.dodajObjekat(prvi);
        grad1.dodajObjekat(drugi);
        grad2.dodajObjekat(treci);

        System.out.println("Grad Leskovac");
        grad1.stampaj();
        System.out.println("Grad Nis");
        grad2.stampaj();

    }
}
