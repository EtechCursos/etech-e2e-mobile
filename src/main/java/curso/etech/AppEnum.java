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
            capabilities.setCapability("device", "Samsung Galaxy S23 Ultra");
            capabilities.setCapability("app", "bs://5402d02f2a5ea3ead9127bc361af84d3415ee603");
            capabilities.setCapability("project", "E2E Mobile");
            capabilities.setCapability("build", "E2E Mobile");
            capabilities.setCapability("deviceName", "Device Farm E.Tech");
            capabilities.setCapability("name", "Testes E2E");
            capabilities.setCapability("autoGrantPermissions", "true");
            capabilities.setCapability("browserstack.uploadMedia", new String[]{"media://dacc1208b8899fe415cf227eb0ceeb4345f75c09"});
            return new AndroidDriver(new URL("https://guilhermeteixeir_YC9nQk:pfT4yp2Z93VsYziQteLs@hub-cloud.browserstack.com/wd/hub"), capabilities);
        }
    };

    AppEnum(String type){}


}
