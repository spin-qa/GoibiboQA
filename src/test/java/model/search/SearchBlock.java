package model.search;

import model.BasePage;
import model.FindHotelsInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class SearchBlock extends BasePage {

    @FindBy(id = "downshift-1-item-0")
    private WebElement downshiftMenuItem0;

    @FindBy(xpath = "//div[.='Check-in']")
    private WebElement checkInBox;

    @FindBy(xpath = "//div[.='Check-out']")
    private WebElement checkOutBox;

    @FindBy(xpath = "//span[.='Guests & Rooms']")
    private WebElement guestAndRoomsBox;

    @FindBy(xpath = "//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-6 PaxWidgetstyles__ContentActionValueWrapperSpan-gv3w6r-7 cGwINZ kKkoZs']")
    private List<WebElement> guestSettings;

    @FindBy(xpath = "//div/span[.='-']")
    private List<WebElement> minusall;

    @FindBy(xpath = "//div/span[.='+']")
    private List<WebElement> plusall;

    /*    @FindBy(xpath = ("//div/span[.='-']"))
    private WebElement minusR;

    @FindBy(xpath = "//div/span[.='-']")
    private WebElement minusA;

    @FindBy(xpath = "//div/span[.='-']")
    private WebElement minusC;*/


/*    @FindBy(xpath = "//div/span[.='+'][1]/")
    private WebElement plusR;

    @FindBy(xpath = "//div/span[.='+'][2]")
    private WebElement plusA;

    @FindBy(xpath = "//div/span[.='+'][3]")
    private WebElement plusC;*/

    @FindBy(xpath = "//div/button[.='Done']")
    private WebElement roomSetupDoneButton;

    @FindBy(xpath = "//button[@data-testid='searchHotelBtn']")
    private WebElement searchHotelButton;


    public SearchBlock(WebDriver driver) {
        super(driver);
    }

    public void getSearchResult() {
        fillingSearchBlock();
        new FindHotelsInPage(getDriver());
    }

    private void fillingSearchBlock() {
        downshiftMenuItem0.click();
        checkInBox.click();
        checkOutBox.click();
        guestAndRoomsBox.click();
        setupRoom(5, 5, 0);
        roomSetupDoneButton.click();
        searchHotelButton.click();
    }

    private void setupRoom(int room, int adult, int child) {

        int index = 0;

        String rooms = guestSettings.get(0).getText();
        for (int i = 1; i < 9; i++) {
            if (rooms.equals(String.valueOf(i))) {
                index = i;
            }
        }
        while (index != room) {
            if (index > room) {
                minusall.get(0).click();
                index--;
            } else {
                plusall.get(0).click();
                index++;
            }
        }

        String adults = guestSettings.get(1).getText();
        for (int i = 1; i < 17; i++) {
            if (adults.equals(String.valueOf(i))) {
                index = i;
            }
        }
        while (index != adult) {
            if (index > adult) {
                minusall.get(1).click();
                index--;
            } else {
                plusall.get(1).click();
                index++;
            }
        }

        String children = guestSettings.get(2).getText();
        for (int i = 0; i < 10; i++) {
            if (children.equals(String.valueOf(i))) {
                index = i;
            }
        }
        while (index != child) {
            if (index > child) {
                minusall.get(2).click();
                index--;
            } else {
                plusall.get(2).click();
                index++;
            }
        }
    }
}
