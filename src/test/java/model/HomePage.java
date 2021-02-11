package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class HomePage extends BasePage{

    @FindBy(xpath = "//a[@href='/hotels/'] /span[.='Hotels']")
    private WebElement hotels;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HotelsPage goHotelsPage(){
        hotels.click();
        return new HotelsPage(getDriver());
    }

}
