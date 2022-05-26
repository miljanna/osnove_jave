package p23_05_2022;

public class Film {

    private String naziv;
    private int godina;

    public Film (){

    }

    public Film (String naziv, int godina){
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getnaziv (){
        return this.naziv;
    }

    public int getGodina (){
        return this.godina;
    }

    public void setnaziv (String naziv){
        this.naziv = naziv;
    }

    public void setgodina (int godina){
        this.godina = godina;
    }

    public void stampaj (){
        System.out.println(this.naziv + ", " + this.godina);
    }





}
