package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return getDriver();
        }

    protected WebDriverWait getWait() {
        if (wait == null) {
        wait = new WebDriverWait(driver, 10);
        }
        return wait;
        }
}
