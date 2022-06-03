package p02_06_2022;

public class StudentOsnovnih extends Student {
//    Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//    koja za cenu skolarine vraca 90000
//    za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//    stampajte podatke po izboru


    public StudentOsnovnih(String imePrezime, int brIndexa, int godineStudija) {
        super(imePrezime, brIndexa, godineStudija);
    }

    @Override
    public int cenaSkolarine (){
        return 90000;
    }

    @Override
    public boolean daLiJeNaBudzetu (){
        if (this.godineStudija < 5){
            return true;
        }
        return false;
    }



}
