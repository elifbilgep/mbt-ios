package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import utilities.WebDriverWaits;

public class WelcomePage {
    IOSDriver driver;

    public WelcomePage(IOSDriver driver) {
        this.driver = driver;
    }

    // Accessibility ID kullanımı
    private final By createAccountButton = MobileBy.AccessibilityId("Create Account");

    public void checkOnWelcomePage() {
        System.out.println("Checking if on Welcome Page");
        new WebDriverWaits(driver).checkElementVisible(createAccountButton, 10);
    }

    public void clickCreateAccount() {
        System.out.println("Clicking Create Account button");
        new WebDriverWaits(driver).waitForElementToBeClickable(createAccountButton, 10);
        driver.findElement(createAccountButton).click();
    }
}
