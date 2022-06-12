package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Random;


public class zadatak_3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Random ran = new Random();

        driver.navigate().to("https://www.ebay.com/");
        Select kategorije = new Select (driver.findElement(By.xpath("//select[@id='gh-cat']")));
        List <WebElement> nizOpcija = kategorije.getOptions();
        int size = nizOpcija.size();

        for (int i = 0; i < size; i++) {
            String opcije = nizOpcija.get(i).getText();
            System.out.println(opcije);
        }

        int broj = ran.nextInt((nizOpcija.size()));
        kategorije.selectByIndex(broj);

        driver.quit();




    }
}
