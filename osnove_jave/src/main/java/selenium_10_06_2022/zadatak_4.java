package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class zadatak_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        Ucitati stranicu https://demoqa.com/modal-dialogs
//        Kliknuti na dugme Large modal
//        Proverite da li se prikazao dijalog i ispisite u konzoli odgovarajuce poruke


        driver.navigate().to("https://demoqa.com/modal-dialogs");

        driver.findElement(By.id("showLargeModal")).click();
        Thread.sleep(5000);

        List<WebElement> elements = driver.findElements(By.className("modal-body"));

        if (elements.size() > 0){
            System.out.println("Element postoji.");
        } else {
            System.out.println("Element ne postoji.");
        }

        driver.quit();






    }
}
