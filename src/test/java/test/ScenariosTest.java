package test;

import model.HomePage;
import model.HotelsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.BaseTest;

public class ScenariosTest extends BaseTest {

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

        hotelsPage.clickSearhLocation();





//        .sendKeys(HOTELNAME);



    }

}
