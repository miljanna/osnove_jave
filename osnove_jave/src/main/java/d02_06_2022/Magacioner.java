package d02_06_2022;

public class Magacioner extends Radnik {
    public Magacioner(String imeIprezime) {
        super(imeIprezime);
    }

    private double prosecnaPlataPoSektorima() {
        double sumaPlata = 0;
        for (int i = 0; i < nizSektora.size(); i++) {


            sumaPlata += nizSektora.get(i).getPlata();
        }
        return sumaPlata / nizSektora.size() * 0.5;

    }

    @Override
    public double plataRadnika() {

        return prosecnaPlataPoSektorima() * nizSektora.size();
    }
}
    //Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
    // ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
    // suma plata svih sektor / broj sektora * 0.5
    // override uje metodu za platu, tako da se plata racuna po formuli:
    //(prosecna plata za sve sektore u kojima radi) * (broj sektora).

