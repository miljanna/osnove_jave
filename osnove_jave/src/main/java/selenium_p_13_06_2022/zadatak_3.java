package selenium_p_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class zadatak_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        Napisati program koji ucitava stranicu
//        https://s.bootsnipp.com/iframe/klDWV i ceka da se ucita progress bar
//        // na 100% a zatim ispisuje tekst u konzoli “Stranica ucitana”

        driver.navigate().to("https://s.bootsnipp.com/iframe/klDWV");
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("precent"), "100%"));
        Thread.sleep(2000);

        if ( wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("precent"), "100%")) == true){
            System.out.println("Stranica je ucitana");
        } else {
            System.out.println("Nije ucitana");
        }

        driver.quit();





    }
}
