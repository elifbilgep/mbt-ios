package pages;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import utilities.WebDriverWaits;

public class SignupPage {
    IOSDriver driver;

    public SignupPage(IOSDriver driver) {
        this.driver = driver;
    }

    private final By usernameField = MobileBy.AccessibilityId("username text field");
    private final By emailField = MobileBy.AccessibilityId("email text field");
    private final By passwordField = MobileBy.AccessibilityId("password textfield");
    private final By termsCheckbox = MobileBy.AccessibilityId("square");
    private final By signupButton = MobileBy.AccessibilityId("Create Account Button");

    public void checkOnSignupPage() {
        System.out.println("Checking if on Signup Page");
        new WebDriverWaits(driver).checkElementVisible(usernameField, 10);
        new WebDriverWaits(driver).checkElementVisible(emailField, 10);
    }

    public void enterUsername(String username) {
        System.out.println("Entering username: " + username);
        new WebDriverWaits(driver).waitForElementToBeClickable(usernameField, 10);
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterEmail(String email) {
        System.out.println("Entering email: " + email);
        new WebDriverWaits(driver).waitForElementToBeClickable(emailField, 10);
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        System.out.println("Entering password");
        new WebDriverWaits(driver).waitForElementToBeClickable(passwordField, 10);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickCheckbox() {
        System.out.println("Clicking terms checkbox");
        new WebDriverWaits(driver).waitForElementToBeClickable(termsCheckbox, 10);
        driver.findElement(termsCheckbox).click();
    }

    public void clickSignupButton() {
        System.out.println("Clicking signup button");
        new WebDriverWaits(driver).waitForElementToBeClickable(signupButton, 10);
        driver.findElement(signupButton).click();
    }
}

