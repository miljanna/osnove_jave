package p03_06_2022.zadatak3;

public class AtleticarMain {
    public static void main(String[] args) {

//    U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“
//    sa proizvoljnim brojem učesnika, učitati podatke o učesnicima obe discipline
//    sa tastature i (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

        Disciplina trkaci = new Disciplina("110m s preponama", "trkacka");
        Disciplina skakaci = new Disciplina("skok u dalj", "skakacka");

        Trkac prvi = new Trkac("Miljana Cvetkovic", 9);
        Trkac drugi = new Trkac("Katarina Pesic", 8);

        Skakac brojJedan = new Skakac("Milan Jovanovic", 10);
        Skakac brojDva = new Skakac("Vladimir Minic", 5);

        trkaci.dodajAtleticara(prvi);
        trkaci.dodajAtleticara(drugi);

        skakaci.dodajAtleticara(brojJedan);
        skakaci.dodajAtleticara(brojDva);

        prvi.KojiJeAtleticarBolji(drugi);
        brojJedan.KojiJeAtleticarBolji(brojDva);

        prvi.stampaj(prvi);



    }
}
