package selenium_d_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class zadatak_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@class, 'fendym')]")).click();
        driver.findElement(By.xpath("//*[contains(@alt, '+ Add photo')]")).click();
        File back = new File("src/main/resources/back_miljana_cvetkovic.jpg");
        WebElement img1 = driver.findElement(By.id("imageUpload"));
        img1.sendKeys(back.getAbsolutePath());
        wait.until(ExpectedConditions
                        .elementToBeClickable(By.xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]")))
                .click();
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//div[contains(@class, 'sc-breuTD')]/img")));
        WebElement popUp = driver.findElement(By.xpath("//div[contains(@class, 'sc-breuTD')]/img"));
        wait.until(ExpectedConditions.visibilityOf(popUp))
                .click();
        driver.findElement(By.xpath("//button[(text()='Use One Side Only')]"))
                .click();


        driver.findElement(By.xpath("//div[contains(@class, 'sc-ivTmOn')]/div[2]/div/img"))
                .click();
        driver.findElement(By.xpath("//*[contains(@alt, '+ Add photo')]"))
                .click();
        File front = new File("src/main/resources/front_miljana_cvetkovic.jpg");
        WebElement img2 = driver.findElement(By.id("imageUpload"));
        img2.sendKeys(front.getAbsolutePath());
        wait.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(By
                        .xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]/div/img")));
        Thread.sleep(5000);
        wait.until(ExpectedConditions
                        .elementToBeClickable(By.xpath(
                        "//div[contains(@class, 'sc-ftvSup')]/div[last()]/div[contains(@class, 'gmXCBU')]/img")))
                .click();
        WebElement popUp2 = driver.findElement(By.xpath("//div[contains(@class, 'sc-iXxrte')]"));
        driver.findElement(By.xpath("//button[(text()='Use One Side Only')]"))
                .click();


        driver.findElement(By.xpath("//div[contains(@class, 'sc-ivTmOn')]/div[3]/div/img"))
                .click();
        driver.findElement(By.xpath("//*[contains(@alt, '+ Add photo')]"))
                .click();
        File left = new File("src/main/resources/left_miljana_cvetkovic.jpg");
        WebElement img3 = driver.findElement(By.id("imageUpload"));
        img3.sendKeys(left.getAbsolutePath());
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]/div/img")));
        Thread.sleep(5000);
        wait.until(ExpectedConditions
                        .elementToBeClickable(By.xpath(
                        "//div[contains(@class, 'sc-ftvSup')]/div[last()]/div[contains(@class, 'gmXCBU')]/img")))
                .click();
        WebElement popUp3 = driver.findElement(By.xpath("//div[contains(@class, 'sc-iXxrte')]"));
        driver.findElement(By.xpath("//button[(text()='Use One Side Only')]"))
                .click();


        driver.findElement(By.xpath("//div[contains(@class, 'sc-ivTmOn')]/div[4]/div/img"))
                .click();
        driver.findElement(By.xpath("//*[contains(@alt, '+ Add photo')]"))
                .click();
        File right = new File("src/main/resources/ja.png");
        WebElement img4 = driver.findElement(By.id("imageUpload"));
        img4.sendKeys(right.getAbsolutePath());
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]/div/img")));
        Thread.sleep(5000);
        wait.until(ExpectedConditions
                        .elementToBeClickable(By.xpath(
                        "//div[contains(@class, 'sc-ftvSup')]/div[last()]/div[contains(@class, 'gmXCBU')]/img")))
                .click();
        WebElement popUp4 = driver.findElement(By.xpath("//div[contains(@class, 'sc-iXxrte')]"));
        driver.findElement(By.xpath("//button[(text()='Use One Side Only')]"))
                .click();


        driver.findElement(By.xpath("//div[contains(@class, 'emMrhw')]")).click();
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
        WebElement alert = driver.findElement(By.xpath("//*[@action='error']"));
        System.out.println("Vrednost je " + alert.getAttribute("action"));

        driver.quit();
    }
}
