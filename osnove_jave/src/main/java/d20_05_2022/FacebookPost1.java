package d20_05_2022;

public class FacebookPost1 {
    public String imeIPrezimeObjavio;
    public String imeIPrezimeObjavljen;
    public String testObjave;
    public int brLajkova;
    public int brDeljenja;


    public FacebookPost1(){

    }

    public FacebookPost1(String imeIPrezimeObjavio, String imeIPrezimeObjavljen, String testObjave){
        this.imeIPrezimeObjavio = imeIPrezimeObjavio;
        this.imeIPrezimeObjavljen = imeIPrezimeObjavljen;
        this.testObjave = testObjave;
    }

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
