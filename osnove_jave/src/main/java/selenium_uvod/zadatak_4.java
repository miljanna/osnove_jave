package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class zadatak_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/oV91g";

        driver.navigate().to(url);
        List<WebElement> paginacija = driver.findElements(By.className("page_link"));

        for (int i = 0; i < paginacija.size(); i++) {
            paginacija.get(i).click();
            Thread.sleep(1000);
        }

        driver.quit();



    }
}
