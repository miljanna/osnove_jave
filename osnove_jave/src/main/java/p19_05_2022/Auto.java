package p19_05_2022;

public class Auto {

    public String imeIPrezime;
    public String marka;
    public int brVrata;
    public int potrosnja;
    public int brzina;
    public String registracija;
    public boolean klima;
    public int godinaProizvodnje;
    public int mesecDoKadaJeRegistracija;
    public int kubikaza;
    public int kapacitetRezervoara;
    public int trenutnoGorivo;


    public void stampaj() {
        System.out.println(this.imeIPrezime);
        System.out.println(this.marka + " - " + this.brVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
        System.out.println(this.brzina + "km/h je trenutna brzina");

    }

    public boolean prekoracenjeBrzine(int ogranicenje) {
        if (this.brzina > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }

    public int novcanaKazna(int ogranicenje) {

        if (this.brzina > ogranicenje){
            int razlika = this.brzina - ogranicenje;
            return razlika * 1000;
        } else {
            return 0;
        }
    }

    public void dodajGas (){
        this.brzina = this. brzina + 10;
    }

    public void koci (){
        this.brzina = this.brzina - 10;
        if (this.brzina < 0){
            this.brzina = 0;
        }
    }

    public double potrosnjaKlima (){
        if (this.klima){
            return this.brzina / 100.0 * this.potrosnja * 1.2;
        } else {
            return this.brzina / 100.0 * this.potrosnja * 1;
        }
    }

    public boolean oldtimer (){
        if (this.godinaProizvodnje < 1950){
            return true;
        } else {
            return false;
        }
    }

    public boolean daLiJeIsteklaReg (int trenutniMesec){
        if (this.mesecDoKadaJeRegistracija < trenutniMesec){
            return true;
        } else {
            return false;
        }
    }

    public double cenaRegistracije (){
        if (this.kubikaza <= 2000){
            return this.kubikaza * 100.0;
        } else {
            return (this.kubikaza * 100.0) * 30/100;
        }
    }

    public double natociGorivo(int litrazaGoriva){
        if ((this.trenutnoGorivo + litrazaGoriva) < this.kapacitetRezervoara){
            return litrazaGoriva * 170;
        } else {
            double prelazakKapaciteta = litrazaGoriva - kapacitetRezervoara;
            return (litrazaGoriva - prelazakKapaciteta) * 170;
        }
    }

    public boolean uporedjivanjeBrzine (Auto auto2){
        if (this.brzina == auto2.brzina){
            return true;
        }
        return false;
    }


//    Dopuniti klasu Auto, tako da ima
//    metodu koja vraca da li auto nad kojim je pozvana metoda
//    ide istom brzinom kao i auto sa kojim se poredi. Ova metoda
//    poredi brzinu sa drugim autom, i parametar metode treba da bude
//    tipa Auto.
//    HINT: Ova metoda treba da se ponasa kao metoda equals za stringove.
//    Zovemo metodu nad jednim stringom i poredimo ga sa drugim, tako i ovde
//    zovemo metodu nad jednim autom i poredimo ga sa drugim
//    (NE SA BRZINOM DRUGOG, NEGO BAS SA AUTOM)


}
