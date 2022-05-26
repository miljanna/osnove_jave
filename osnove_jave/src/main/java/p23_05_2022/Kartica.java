package p23_05_2022;

public class Kartica {

    private int popust;
    private String brojKartice;

    public Kartica(){

    }

    public Kartica(int popust, String brojKartice){
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public int getPopust (){
        return this.popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
}
