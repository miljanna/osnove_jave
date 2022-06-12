package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class UvodUImplicitniWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        Ucitava stranicu https://demoqa.com/login
//        Loginuje se sa usename itbootcamp i lozinkom ITBootcamp2021!
//        Zatim ceka 5sekundi da se korisnik uloguje
//        Proverava da li se korisnik ulogovao,
//        tako sto se proverava postojanje dugmeta Logout.
//        Ispisati odgovarajucu poruku u konzoli za rezultat loginovanja.
//        Klikce na dugme za logout
//        Gasi stranicu



        driver.navigate().to("https://demoqa.com/login");

        driver
                .findElement(By.id("userName"))
                .sendKeys("itbootcamp");


        driver
                .findElement(By.id("password"))
                .sendKeys("ITBootcamp2021!");


        driver
                .findElement(By.id("login"))
                .click();

        Thread.sleep(5000);

        List<WebElement> elements = driver.findElements(By.id("submit"));
        if (elements.size() > 0){
            System.out.println("Element postoji.");
        } else {
            System.out.println("Element ne postoji.");
        }

        driver
                .findElement(By.id("submit"))
                .click();

        driver.quit();







    }
}
