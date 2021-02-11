package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindHotelsInPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='LOCATION NAME' and @value= '" + "Ooty" + "']")
    private WebElement locationBox;

    //[@value= ' " + 1 + " Guest in " + 1 + " Room ']
    @FindBy(xpath = "//div[4]/input")
    private WebElement guestsAndRoomsBox;


    public FindHotelsInPage(WebDriver driver) {
        super(driver);

     }

     public void goSearchFieldsValidation(){
        locationBox.isEnabled();
        guestsAndRoomsBox.isEnabled();
     }
}
