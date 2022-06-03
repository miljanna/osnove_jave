package p03_06_2022.zadatak3;

public class Trkac extends Atleticar{
//    Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar.
//    Kod trkača je bolji manji rezultat, a kod skakača veći.


    public Trkac(String imePrezime, int rezultatSaTakmicenja) {
        super(imePrezime, rezultatSaTakmicenja);
    }

    @Override
    public boolean KojiJeAtleticarBolji (Atleticar atleticar){
        if (this.getRezultatSaTakmicenja() < atleticar.getRezultatSaTakmicenja()){
            return true;
        }
        return false;
    }


}
