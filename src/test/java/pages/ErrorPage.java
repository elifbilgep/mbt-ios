package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import utilities.WebDriverWaits;

public class ErrorPage {
    IOSDriver driver;

    public ErrorPage(IOSDriver driver) {
        this.driver = driver;
    }

    private final By errorMessage = MobileBy.AccessibilityId("Error Message");
    private final By tryAgainButton = MobileBy.AccessibilityId("Try Again");

    public void checkOnErrorPage() {
        System.out.println("Checking if on Error Page");
        new WebDriverWaits(driver).checkElementVisible(errorMessage, 10);
    }

    public void clickTryAgain() {
        System.out.println("Clicking Try Again button");
        new WebDriverWaits(driver).waitForElementToBeClickable(tryAgainButton, 10);
        driver.findElement(tryAgainButton).click();
    }
}