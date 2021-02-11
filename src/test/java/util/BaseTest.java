package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    private static final String HOMEPAGE = "https://www.goibibo.com/";

    private static void setBrowser() {
        WebDriverManager.chromedriver().setup();
    }

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    @BeforeMethod
    public void setUp() {
        setBrowser();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(HOMEPAGE);
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected WebDriverWait getWebDriverWait() {
        if (webDriverWait == null) {
            webDriverWait = new WebDriverWait(driver, 5);
        }
        return webDriverWait;
    }

    protected WebDriver getDriver() {
        return driver;
    }


}
