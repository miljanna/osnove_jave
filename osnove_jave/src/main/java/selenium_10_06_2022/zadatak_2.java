package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zadatak_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.ebay.com/");

        Select kategorije = new Select (driver.findElement(By.xpath("//select[@id='gh-cat']")));

        kategorije.selectByVisibleText("Crafts");
        kategorije.selectByIndex(13);

        Thread.sleep(5000);

        driver.quit();







    }
}
