package selenium_p_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class zadatak_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

//        Napisati program koji:
//        Pre nego sto krenete u automatizaciju prvo sve korake uradite rucno
//        Implicitno cekanje za trazenje elemenata je maksimalno 10s
//        Implicitno cekanje za ucitavanje stranice je 5s
//        Ucitava stranicu https://docs.katalon.com/
//        Maksimizuje prozor
//        Od html elementa cita data-theme atribut.
//        Korisni linkovi za citanje vrednosti atributa link1 i link2
//        Proverava da li je sadrzaj u tom atributu light i ispisuje odgovarajuce poruke
//        Klikce na dugme za zamenu tema
//        Ponovo cita data-theme atribut html elementa
//        i validira da u atributu stoji vrednost dark
//        Izvrsava kombinaciju tastera CTRL + K.
//        Koristan link  za keyboard actions…kako izvrsavati precice preko Actions objekta
//        Zatim od inputa za pretragu cita atribut type i proverava da je vrednost tog atributa search
//        Zatvara pretrazivac

        driver.navigate().to("https://docs.katalon.com/");
        driver.manage().window().maximize();

        WebElement tema = driver.findElement(By.xpath("/html"));

        String nazivTeme = tema.getAttribute("data-theme");

        if (nazivTeme.equals("light")){
            System.out.println("Tema je light.");
        } else {
            System.out.println("Tema je dark.");
        }

        driver
                .findElement(By.xpath("//button[contains(@class, 'toggleButton_rCf9')]"))
                .click();

        WebElement tema1 = driver.findElement(By.xpath("/html"));

        String nazivTeme1 = tema.getAttribute("data-theme");

        if (nazivTeme1.equals("dark")){
            System.out.println("Tema je dark.");
        } else {
            System.out.println("Tema je light.");
        }

        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .sendKeys("k")
                .perform();

        WebElement element = driver.findElement(By.xpath("//input[contains(@type, 'search')]"));

        if (element.getAttribute("type").equals("search")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        driver.quit();


    }
}
