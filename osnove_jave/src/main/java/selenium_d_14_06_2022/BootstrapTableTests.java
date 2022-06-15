package selenium_d_14_06_2022;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BootstrapTableTests {

    private WebDriver driver;
    private String baseURL = "https://s.bootsnipp.com";


    @BeforeClass
    public void beforeClass (){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod (){
        driver.navigate().to(baseURL);
        driver.manage().window().maximize();
    }

    @Test (priority = 10)
    public void editRow (){
        driver.navigate().to(baseURL + "/iframe/K5yrx");
        Assert.assertEquals(driver.getTitle(), "Table with Edit and Update Data - Bootsnipp.com",
                "The titles are not a match.");
        driver.findElement(By.xpath("//button[contains(@data-uid, '1')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("modal-content")));
        driver.findElement(By.id("fn")).clear();
        driver.findElement(By.id("fn")).sendKeys("Miljana");
        driver.findElement(By.id("ln")).clear();
        driver.findElement(By.id("ln")).sendKeys("Cvetkovic");
        driver.findElement(By.id("mn")).clear();
        driver.findElement(By.id("mn")).sendKeys("Mika");
        driver.findElement(By.id("up")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modal-content")));
        Assert.assertEquals(driver.findElement(By.id("f1")).getText(), "Miljana",
                "The names are not a match.");
        Assert.assertEquals(driver.findElement(By.id("l1")).getText(), "Cvetkovic",
                "The lastnames are not a match.");
        Assert.assertEquals(driver.findElement(By.id("m1")).getText(), "Mika",
                "The middle names are not a match.");
    }

    @Test (priority = 20)
    public void deleteRow () {
        driver.navigate().to(baseURL + "/iframe/K5yrx");
        Assert.assertEquals(driver.getTitle(), "Table with Edit and Update Data - Bootsnipp.com",
                "The titles are not a match.");
        driver.findElement(By.xpath("//button[contains (@data-target, '#delete')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                "//div[contains (@id, 'delete')]/div[2]/div")));
        driver.findElement(By.xpath("//table/tbody/tr"));
        driver.findElement(By.id("del")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("delete")));
        List <WebElement> deletedRows = driver.findElements(By.xpath("//table/tbody/tr[0]"));
        Assert.assertTrue(deletedRows.isEmpty(), "[ERROR] Row is not deleted");
    }

    @Test (priority = 30)
    public void takeAScreenshot () throws IOException {
        driver.navigate().to(baseURL + "/iframe/K5yrx");
        Assert.assertEquals(driver.getTitle(), "Table with Edit and Update Data - Bootsnipp.com",
                "The titles are not a match.");

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/main/resources/screenshot.png");
        FileHandler.copy(srcFile,destFile);
    }

    @AfterMethod
    public void afterMethod (){


    }

    @AfterClass
    public void afterClass (){

        driver.quit();
    }
}
