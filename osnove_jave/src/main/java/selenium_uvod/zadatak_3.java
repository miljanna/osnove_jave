package selenium_uvod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class zadatak_3 {
    public static void main(String[] args) {
        ArrayList <String> nizSajtova = new ArrayList<>();

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String google = "https://google.com/";
        String youtube = "https://youtube.com/";
        String ebay = "https://www.ebay.com/";
        String kp = "https://www.kupujemprodajem.com/";

        nizSajtova.add(google);
        nizSajtova.add(youtube);
        nizSajtova.add(ebay);
        nizSajtova.add(kp);

        for (int i = 0; i < nizSajtova.size(); i++) {
            driver.navigate().to(nizSajtova.get(i));
            System.out.println("Page title is : " + driver.getTitle());
        }

        driver.quit();

//        driver.navigate().to(google);
//        driver.navigate().to(youtube);
//        driver.navigate().to(ebay);
//        driver.navigate().to(kp);





    }
}
