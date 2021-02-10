package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SearchBlock extends BasePage{

    public SearchBlock(WebDriver driver, String name) {
        super(driver);
    }

    @FindBy(id="downshift-1-item-0")
    //         "//li/span[.='Ooty']"
    public WebElement downshiftMenuItem0;

    @FindBy(xpath = "//div[.='Check-in']")
    public WebElement checkInBox;

    @FindBy(xpath = "//div[.='Check-out']")
    public WebElement checkOutBox;

    @FindBy(xpath = "//span[.='Guests & Rooms']")
    public WebElement guestAndRoomsBox;

    @FindBy(xpath = "//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-6 PaxWidgetstyles__ContentActionValueWrapperSpan-gv3w6r-7 cGwINZ kKkoZs']")
    public WebElement rooms;

    @FindBy(xpath = "//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-6 PaxWidgetstyles__ContentActionValueWrapperSpan-gv3w6r-7 cGwINZ kKkoZs']")
    public WebElement adults;

    @FindBy(xpath = "//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-6 PaxWidgetstyles__ContentActionValueWrapperSpan-gv3w6r-7 cGwINZ kKkoZs']")
    public WebElement children;

    @FindBy(xpath = "//div/button[.='Done']")
    public WebElement roomSetupDone;


    public SearchBlock fillingSearchBlock(){
        downshiftMenuItem0.click();
        checkInBox.click();
        checkOutBox.click();
        guestAndRoomsBox.click();
        return this;
    }

    public void setupRoom(int rooms, int adults, int children){



    }
}
