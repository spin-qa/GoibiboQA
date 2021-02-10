package test;

import model.SearchBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.BaseTest;
import util.Utils;

import javax.swing.text.Element;

public class ScenariosTest extends BaseTest {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    private static final String HOMEPAGE = "https://www.goibibo.com/";
    private static final String HOTELSPAGE = "https://www.goibibo.com/hotels/";
    private static final String HOTELNAME = "Ooty";

    @Test
    public void scenario1() {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get(HOMEPAGE);
        driver.findElement(By.xpath("//a[@href='/hotels/'] /span[.='Hotels']")).click();
        Assert.assertEquals(HOTELSPAGE, driver.getCurrentUrl());

        driver.findElement(By.id("downshift-1-input")).sendKeys(HOTELNAME);


    }

}
