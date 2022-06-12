package selenium_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        Napisati program koji prijavljivanju na stranicu
//        http://cms.demo.katalon.com/my-account/, cekira Remember me checkbox.

        String url = "https://cms.demo.katalon.com/my-account/";

        driver.navigate().to(url);

        driver.findElement(By.xpath("//input[contains (@type, 'checkbox')]")).click();
        Thread.sleep(5000);

        driver.quit();




    }
}
