package curso.etech;

import curso.etech.common.StaticVariables;
import curso.etech.interfaces.AppInt;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public enum AppEnum implements AppInt {
    ANDROID("ANDROID") {
        @Override
        public AndroidDriver getDriver() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            StaticVariables.setDevice("emulator-5554");
            capabilities.setCapability("deviceName", "Emulador E.Tech");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("udid", StaticVariables.getDevice());
            capabilities.setCapability("platformVersion", "12");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "br.com.filme.app");
            capabilities.setCapability("appActivity", "br.com.filme.app.modules.onboardingone.ui.OnboardingOneActivity");
            capabilities.setCapability("autoGrantPermissions", "true");
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }
    },

    ANDROID_FARM("ANDROID_FARM") {
        @Override
        public AndroidDriver getDriver() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            StaticVariables.setDevice("device-farm");
            capabilities.setCapability("os_version", "13.0");
            capabilities.setCapability("device", "Samsung Galaxy S23");
            capabilities.setCapability("app", "bs://21d32368f821bfb7ef6634560c410da22e4d2495");
            capabilities.setCapability("project", "E2E Mobile");
            capabilities.setCapability("build", "E2E Mobile");
            capabilities.setCapability("deviceName", "Device Farm E.Tech");
            capabilities.setCapability("name", "Testes E2E");
            capabilities.setCapability("autoGrantPermissions", "true");
            capabilities.setCapability("browserstack.uploadMedia", new String[]{"media://4958803b38d810bfbc6ceee73c715a741df9cddb"});
            return new AndroidDriver(new URL("https://guilhermeteixeir_Uu6lm9:ZjxU2cYizz32Wwu48YpK@hub-cloud.browserstack.com/wd/hub"), capabilities);
        }
    };

    AppEnum(String type){}


}
