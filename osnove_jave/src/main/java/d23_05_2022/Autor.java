package d23_05_2022;

public class Autor {

    private String imePrezime;

    public Autor (){

    }

    public Autor (String imePrezime){

        this.imePrezime = imePrezime;
    }

    public String getImePrezime() {

        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {

        this.imePrezime = imePrezime;
    }

    public void stampaj (){

        System.out.println(imePrezime);
    }
}
