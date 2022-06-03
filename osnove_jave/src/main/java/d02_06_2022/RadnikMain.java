package d02_06_2022;

public class RadnikMain {
    public static void main(String[] args) {

        //U glavnom programu kreirati jednog magacionera i jednog menadzera,
        // postaviti sektore u kojima rade i ispisati platu za svakog

        Sektor s = new Sektor("Proizvodnja", 20000);
        Sektor s2 = new Sektor("Prerada", 50000);
        Sektor s3 = new Sektor("Nabavka", 100000);

        Radnik magacioner = new Magacioner("Miljana Cvetkovic");
        Radnik menadzer = new Menadzer("Katarina Pesic");

        magacioner.zaposliUSektor(s);
        magacioner.zaposliUSektor(s2);
        menadzer.zaposliUSektor(s3);
        menadzer.zaposliUSektor(s);

        System.out.println("Plata magacionera " + magacioner.getImeIprezime() + " je " + magacioner.plataRadnika());
        System.out.println("Plata menadzera " + menadzer.getImeIprezime() + " je " + menadzer.plataRadnika());


    }
    }
