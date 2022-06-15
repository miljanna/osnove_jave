package UvodUTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;

public class KatalonLoginTest {

    private WebDriver driver;
    private String baseURL = "https://cms.demo.katalon.com";

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
    }

    @Test (priority = 10)
    public void visitLoginPageFromNavBar (){
        driver.navigate().to(baseURL + "/");
        driver.findElement(By.className("page-item-10")).click();
        Assert.assertEquals(driver.getTitle(), "My account – Katalon Shop",
                "The actual title did not match expected title.");
        Assert.assertTrue(driver.getCurrentUrl().contains("/my-account"),
                "The current url doesn't contain '/my-account'");
    }

    @Test (priority = 20)
    public void checkInputTypes () {
        driver.navigate().to(baseURL + "/my-account");
        Assert.assertEquals(driver.findElement(By.id("username")).getAttribute("type"), "text",
                "Email attribute type does not match 'text'");
        Assert.assertEquals(driver.findElement(By.id("password")).getAttribute("type"), "password",
                "Password attribute type does not match 'password'");
        Assert.assertEquals(driver.findElement(By.id("rememberme")).getAttribute("type"), "checkbox",
                "Checkbox attribute type does not match 'checkbox'");
        Assert.assertFalse(driver.findElement(By.id("rememberme")).isSelected(),
                "The checkbox is not selected.");

    }

    @Test (priority = 30)
    public void displayErrorWhenCredentialsAreWrong(){
        driver.navigate().to(baseURL + "/my-account");
        driver.findElement(By.id("username")).sendKeys("invalidemail@gmail.com");
        driver.findElement(By.id("password")).sendKeys("invalid123");
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();

        WebElement alert = driver.findElement(By.className("woocommerce-notices-wrapper"));
        ArrayList <WebElement> greska = new ArrayList<>();
        greska.add(alert);
        Assert.assertTrue(greska.size()>0, "[ERROR] There is not an element showing an error");
        Assert.assertTrue(driver.getCurrentUrl().contains("/my-account"),
                "The current url doesn't contain '/my-account'");

    }

    @AfterMethod
    public void afterMethod (){

    }

    @AfterClass
    public void afterClass (){
        driver.quit();
    }
}
