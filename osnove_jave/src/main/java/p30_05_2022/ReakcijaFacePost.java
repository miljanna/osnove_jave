package p30_05_2022;

public class ReakcijaFacePost {
    public static void main(String[] args) {

        Reakcija prva = new Reakcija("smajli", "Miljana Cvetkovic");
        Reakcija druga = new Reakcija("lajk", "Kristina Vujicic");
        Reakcija treca = new Reakcija("srce", "Sanela Solunac");
        Reakcija cetvrta = new Reakcija("smajli", "Nikola Ilic");



        FacePost objava = new FacePost("Milan Jovanovic", "Ajmo drustvo serujte ekran");
        objava.reaguj(druga);
        objava.reaguj(prva);
        objava.reaguj(cetvrta);
        objava.reaguj(treca);

        objava.stampaj();
    }
}
