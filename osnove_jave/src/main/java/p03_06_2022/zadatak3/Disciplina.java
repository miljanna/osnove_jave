package p03_06_2022.zadatak3;

import java.util.ArrayList;

public class Disciplina {
//    Kreirati i klasu Disciplina čiji su privatni atributi:
//    ime discipline
//    tip discipline (Trkacka ili Skakacka)
//    niz atletičara koji učestvuju u toj disciplini.
//    U javnom delu klase definisati:
//    konstuktore, gettere i settere
//    konstruktor koji postavlja ime discipline i tip
//    metodu dodaj atleticara u disciplinu
//    metodu diskvalifikuj atleticara iz discipline, za parametar
//    funkcije prima se ime i prezime atleticara

    private String imeDiscipline;
    private String tipDiscipline;

    private ArrayList <Atleticar> nizAtleticara = new ArrayList<>();

    public Disciplina (){}

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
    }

    public String getImeDiscipline() {

        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {

        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {

        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {

        this.tipDiscipline = tipDiscipline;
    }

    public void dodajAtleticara (Atleticar atleticar){

        nizAtleticara.add(atleticar);
    }

    public void diskvalifikujAtleticara (String imePrezime){
        for (int i = 0; i < this.nizAtleticara.size(); i++) {
            if (nizAtleticara.get(i).equals(imePrezime)){
                nizAtleticara.remove(i);
            }
        }
    }

}
