package test;

import model.FindHotelsInPage;
import model.HomePage;
import model.HotelsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.BaseTest;

public class ScenariosTest extends BaseTest {

    String locationResult;

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    private static final String HOMEPAGE = "https://www.goibibo.com/";
    private static final String HOTELSPAGE = "https://www.goibibo.com/hotels/";
    private static final String HOTELNAME = "Ooty";

    @Test
    public void scenario1() {
        WebDriver driver = getDriver();
        WebDriverWait wait = getWebDriverWait();

        driver.get(HOMEPAGE);

        HomePage homepage = new HomePage(driver);
        HotelsPage hotelsPage = homepage.goHotelsPage();
        Assert.assertEquals(HOTELSPAGE, driver.getCurrentUrl());

        hotelsPage.clickSearhLocation(HOTELNAME).getsearchresult();

        //validation
        driver.findElement(By.xpath("//input[@placeholder='LOCATION NAME' and @value='Ooty']")).isEnabled();


    }

}
