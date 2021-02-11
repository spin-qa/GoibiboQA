package model;

import model.search.SearchBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class HotelsPage extends BasePage{

    @FindBy(xpath = "//input[@aria-labelledby ='downshift-1-label']")
    private WebElement searchField;

    public HotelsPage(WebDriver driver) {
        super(driver);
    }

    public SearchBlock clickSearhLocation(String inputName){
        searchField.click();
        searchField.sendKeys(inputName);
        return new SearchBlock(getDriver());


    }
}
