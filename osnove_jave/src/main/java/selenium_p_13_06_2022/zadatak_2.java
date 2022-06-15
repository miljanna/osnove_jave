package selenium_p_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class zadatak_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

//        Napisati program koji ucitava stranicu https://www.file.io/ aploaduje fajl
//        (ZA vezbanje)
//        Probajte upload razlicitih fajlova, npr:
//        fajl velciine 20mb => mozete da ga napravite tako sto zipujete grupu nekih fajlova, slika …

        driver.navigate().to("https://www.file.io/");
        driver.manage().window().maximize();

        File fajl = new File("src/main/resources/Miljana Cvetkovic_CV.pdf");

        driver.findElement(By.xpath("//input[contains(@id, 'upload-button')]"))
                .sendKeys(fajl.getAbsolutePath());

        Thread.sleep(8000);

        driver.quit();



    }
}
