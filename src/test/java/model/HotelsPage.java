package model;

import model.search.SearchBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class HotelsPage extends BasePage{

    @FindBy(id = "#downshift-1-input")
    private WebElement searchField;

    public HotelsPage(WebDriver driver) {
        super(driver);
    }

    public SearchBlock clickSearhLocation(){
        searchField.click();
        return new SearchBlock(getDriver());


    }
}
