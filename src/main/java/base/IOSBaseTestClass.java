package base;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.AppiumServer;

import java.net.URL;

public class IOSBaseTestClass {
    protected static IOSDriver driver;
    private AppiumServer appiumServer;

    @Before
    public void setUp() throws Exception {
        // Appium sunucusunu başlat
        appiumServer = new AppiumServer();
        appiumServer.startServer();

        // iOS cihaz için özellikleri ayarla
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "18.0"); // Hedef iOS sürümü
        capabilities.setCapability("deviceName", "iPhone 16 Pro");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("udid", "84ED4568-3E5C-406C-BC93-01F713A071C5");
        capabilities.setCapability("app", "/Users/elifparlak/Library/Developer/Xcode/DerivedData/Setup_Focus-aqcxvuebfyidnagybbaprotzcwml/Build/Products/Debug-iphonesimulator/Setup Focus.app");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (appiumServer != null) {
            appiumServer.stopServer();
        }
    }
}