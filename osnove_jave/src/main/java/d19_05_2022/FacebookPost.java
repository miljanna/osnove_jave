package d19_05_2022;

public class FacebookPost {

    public String imeIPrezimeObjavio;
    public String imeIPrezimeObjavljen;
    public String testObjave;
    public int brLajkova;
    public int brDeljenja;

    public void like (){
        this.brLajkova = this.brLajkova + 1;
    }

    public void dislike (){
        this.brLajkova = this.brLajkova - 1;
        if (this.brLajkova < 0){
            this.brDeljenja = 0;
        }
    }

    public void share (){
        this.brDeljenja = this.brDeljenja + 1;
    }

    public void print (){
        System.out.println(this.imeIPrezimeObjavio + " >>> " + this.imeIPrezimeObjavljen);
        System.out.println("Ovo je tekst objave: " + this.testObjave);
        System.out.println("Likes " + this.brLajkova + " | " + "Shares " + this.brDeljenja);
    }

}

//    share(), koja povecava broj deljenja za 1
//    print(), koja stampa objavu u formatu:
//    (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//    (tekst objave)
//    Likes (broj lajkova) | Shares (broj deljenja)
//    U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//    Primer stampanja:
//    Milan Jovanovic >>> Pera Peric
//    Ovo je tekst objave
//    Likes 3 | Shares 1