package p02_06_2022;

public class StudentMaster extends Student{
//    Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//    koja za cenu skolarine vraca 100000
//    za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//    U glavnoj klasi kreirati studente i testirati funkciolanosti


    public StudentMaster(String imePrezime, int brIndexa, int godineStudija) {
        super(imePrezime, brIndexa, godineStudija);
    }

    @Override
    public int cenaSkolarine (){
        return 100000;
    }

    @Override
    public boolean daLiJeNaBudzetu (){
        if (this.godineStudija < 2){
            return true;
        }
        return false;
    }
}
