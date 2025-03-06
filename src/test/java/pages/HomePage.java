package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import utilities.WebDriverWaits;

public class HomePage {
    IOSDriver driver;

    public HomePage(IOSDriver driver) {
        this.driver = driver;
    }

    private final By homePageIndicator = MobileBy.AccessibilityId("Skip");

    public void checkOnHomePage() {
        System.out.println("Checking if on Home Page");
        new WebDriverWaits(driver).checkElementVisible(homePageIndicator, 10);
    }
}