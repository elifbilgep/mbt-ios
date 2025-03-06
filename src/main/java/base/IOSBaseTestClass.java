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
        capabilities.setCapability("platformVersion", "15.0"); // Hedef iOS sürümü
        capabilities.setCapability("deviceName", "iPhone 13");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("bundleId", "com.yourapp.appname");

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