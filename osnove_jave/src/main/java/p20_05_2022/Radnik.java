package p20_05_2022;

public class Radnik {
    public String jmbg;
    public String imeIPrezime;
    public int brojDece;
    public int strucnaSprema;
    public int radniStaz;


    public Radnik (String jmbg){
        this.jmbg = jmbg;
    }

    public Radnik (String jmbg, String imeiPrezime, int brojDece, int strucnaSprema, int radniStaz){
        this.jmbg = jmbg;
        this.imeIPrezime = imeiPrezime;
        this.brojDece = brojDece;
        this.strucnaSprema = strucnaSprema;
        this.radniStaz = radniStaz;
    }

        public double minuliRad (){
            if (this.radniStaz < 10){
                return 0.05;
            } else if (this.radniStaz >= 10 && this.radniStaz < 20){
                return 0.075;
            }
            else return 0;
        }

        public void koeficijentSlozenosti(){

        }

        public void plataRadnika(){

        }

        public void daLiJeKreditnoSposoban (){

        }

        public void slobodniDani (){

        }


}
