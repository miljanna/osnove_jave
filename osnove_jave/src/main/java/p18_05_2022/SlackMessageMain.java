package p18_05_2022;

public class SlackMessageMain {
    public static void main(String[] args) {

//        Kreirati klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim
//        podacima i ostampati obe poruke u formatu:
//        [ime i prezime osobe] - [kad je poslata]
//        [Tekst poruke]


        SlackMessage poruka1 = new SlackMessage();
        poruka1.tekst = "Cao, sta radis?";
        poruka1.imeIPrezime = "Milan Jovanovic";
        poruka1.datumIVreme = "18.05.2022. 21:50";
        System.out.println(poruka1.imeIPrezime + " - " + poruka1.datumIVreme);
        System.out.println(poruka1.tekst);

        System.out.println();

        SlackMessage poruka2 = new SlackMessage();
        poruka2.tekst = "Radim zadatke 10min pred kraj casa.";
        poruka2.imeIPrezime = "Miljana Cvetkovic";
        poruka2.datumIVreme = "18.05.2022. 21:55";
        System.out.println(poruka2.imeIPrezime + " - " + poruka2.datumIVreme);
        System.out.println(poruka2.tekst);








    }
}
