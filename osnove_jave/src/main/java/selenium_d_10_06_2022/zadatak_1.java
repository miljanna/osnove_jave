package selenium_d_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class zadatak_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//        Klikce na svaki iks da ugasi obavestenje i proverava
//        da li se nakon klika element obrisao sa stranice i ispisuje
//        odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//        POMOC: Brisite elemente odozdo.
//        (ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
//
        driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");

       List<WebElement> iksici = driver.findElements(By.className("close"));

       Thread.sleep(2000);

//        for (int i = iksici.size(); i > 0; i--) {
//            iksici.get(i).click();
//            Thread.sleep(3000);
//        }

        for (int i = 0; i < iksici.size(); i++) {
            iksici.get(i).click();
            Thread.sleep(3000);

            List<WebElement> elementi = driver.findElements(By.className("close"));
            if (elementi.size() > 0){
                System.out.println("Element postoji.");
            } else {
                System.out.println("Element ne postoji.");
            }
        }

        driver.quit();


    }
}
