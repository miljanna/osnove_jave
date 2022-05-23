package d19_05_2022;

public class SmartAirConditioning {

    public String marka;
    public int potrosnjaDokHladi;
    public int potrosnjaDokGreje;
    public int temperatura;
    public String mod;

    public void stampaj (){
        System.out.println(this.marka + " - " + this.mod + " - " + temperatura);
        System.out.println("Vasa mesecna potrosnja je: " + potrosnja() + "KW/h"
                            + ", a vasi mesecni troskovi su: " + potrosenNovac());
    }

    public int potrosnja (){
        if (mod.equals("greje")){
            return 30 * 15 * potrosnjaDokGreje;
        } if (mod.equals("hladi")){
            return 30 * 15 * potrosnjaDokHladi;
        }
            return 0;
        }

    public int potrosenNovac() {
        if (this.potrosnja() <= 350){
            return this.potrosnja() * 6;
        } else {
            return this.potrosnja() * 9;
        }

    }


//    metodu za stampu - stampa u formatu
//    marka - mod - termperatura
//    metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//    30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)

//    metodu koja racuna koliko klima novca potrosi za mesec dana
//    Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//    Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//    Metoda vraca ukupnu cenu za taj mesec
//    U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

}
