package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindHotelsInPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='LOCATION NAME']")
    private WebElement LocationBox;


    public FindHotelsInPage(WebDriver driver) {
        super(driver);
     }
}
