package curso.etech.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public static AndroidDriver driver;
    public static WebDriverWait wait;
    public void inicializarDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        StaticVariables.setDevice("RQCT103ZMAA");
        capabilities.setCapability("deviceName", "Emulador E.Tech");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("udid",StaticVariables.getDevice());
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "br.com.filme.app");
        capabilities.setCapability("appActivity", "br.com.filme.app.modules.onboardingone.ui.OnboardingOneActivity");
        capabilities.setCapability("autoGrantPermissions", "true");
        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
}
