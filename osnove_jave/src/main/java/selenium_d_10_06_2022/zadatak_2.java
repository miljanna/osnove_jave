package selenium_d_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.support.ui.Select;


public class zadatak_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Random random = new Random();

//        Napisati program koji ucitava stranicu https://geodata.solutions/
//        Bira proizvoljan Country, State i City
//        Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//        I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//        Izabrerit Country, State i City tako da imate podatke da selektujete!

        driver.navigate().to("https://geodata.solutions/");

        Select country = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> options = country.getOptions();
        int randomIndex = random.nextInt(options.size());
        country.selectByIndex(randomIndex);
        Thread.sleep(2000);

        Select state = new Select(driver.findElement(By.id("stateId")));
        List<WebElement> options1 = state.getOptions();
        int randomIndex1 = random.nextInt(options1.size());
        state.selectByIndex(randomIndex1);
        Thread.sleep(2000);

        Select city = new Select(driver.findElement(By.id("cityId")));
        List<WebElement> options2 = city.getOptions();
        int randomIndex2 = random.nextInt(options2.size());
        city.selectByIndex(randomIndex2);
        Thread.sleep(2000);

        driver.quit();




    }
}
