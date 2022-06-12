package selenium_d_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class zadatak_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Scanner s = new Scanner(System.in);

//
//        Maksimizirati prozor
//        Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//        Dohvatite dugmice za rejting kao listu.
//        XPath za trazenje treba da bude preko id atributa i
//        za ovo trebace vam contains u xpath-u
//        Od korisnika ucitati broj (preko scannera) na koju
//        zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//        I izvrsite akciju klik na odgovarajuci element preko indeksa
//        Na kraju programa ugasite pretrazivac.

        String url = "https://s.bootsnipp.com/iframe/WaXlr";


        driver.manage().window().maximize();
        driver.navigate().to(url);

        driver.findElements(By.xpath("//button[contains(@id, 'rating-star')]"));

        System.out.println("Unesite broj od 1 do 5: ");
        int brojZvezdice = s.nextInt();

        Thread.sleep(3000);

        if (brojZvezdice == 1){
            driver
                    .findElement(By.id("rating-star-1"))
                    .click();
        } else if (brojZvezdice == 2){
            driver
                    .findElement(By.id("rating-star-2"))
                    .click();
        } else if (brojZvezdice == 3){
            driver
                    .findElement(By.id("rating-star-3"))
                    .click();
        } else if (brojZvezdice == 4){
            driver
                    .findElement(By.id("rating-star-4"))
                    .click();
        } else if (brojZvezdice == 5){
            driver
                    .findElement(By.id("rating-star-5"))
                    .click();
        }

        Thread.sleep(3000);

        driver.quit();






    }
}
