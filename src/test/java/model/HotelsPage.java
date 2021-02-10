package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsPage extends BasePage{

    HotelsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "#downshift-1-input")
    private WebElement searchField;
}
