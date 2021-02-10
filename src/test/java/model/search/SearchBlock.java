package model.search;

import model.BasePage;
import model.FindHotelsInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public final class SearchBlock extends BasePage{

    @FindBy(id="downshift-1-item-0")
    //         "//li/span[.='Ooty']"
    private
    WebElement downshiftMenuItem0;

    @FindBy(xpath = "//div[.='Check-in']")
    private WebElement checkInBox;

    @FindBy(xpath = "//div[.='Check-out']")
    private WebElement checkOutBox;

    @FindBy(xpath = "//span[.='Guests & Rooms']")
    private WebElement guestAndRoomsBox;

    @FindBy(xpath = "//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-6 PaxWidgetstyles__ContentActionValueWrapperSpan-gv3w6r-7 cGwINZ kKkoZs'][1]")
    public WebElement rooms;

        @FindBy(xpath = "//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-6 PaxWidgetstyles__ContentActionValueWrapperSpan-gv3w6r-7 cGwINZ kKkoZs'][2]")
    public WebElement adults;

      @FindBy(xpath = "//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-6 PaxWidgetstyles__ContentActionValueWrapperSpan-gv3w6r-7 cGwINZ kKkoZs'][3]")
    public WebElement children;

    @FindBy(xpath = "//div/button[.='Done']")
    public WebElement roomSetupDoneButton;

    public SearchBlock(WebDriver driver) {
        super(driver);

    }

    public void fillingSearchBlock(){
        downshiftMenuItem0.click();
        checkInBox.click();
        checkOutBox.click();
        guestAndRoomsBox.click();
        setupRoom(1, 1, 0);
        roomSetupDoneButton.click();
    }

    public FindHotelsInPage getsearchresult(){
        fillingSearchBlock();
        return new FindHotelsInPage(getDriver());
    }

    private void setupRoom(int rooms, int adults, int children){



    }
}
