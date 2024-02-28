package curso.etech.configuration;

import curso.etech.enums.AppEnum;
import curso.etech.common.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.ScreenshotException;

import java.net.MalformedURLException;
public class Hooks extends BaseTest {

    @Before
    public void before() throws MalformedURLException {
        super.inicializarDriver(AppEnum.ANDROID);
    }

    @After
    public void after(Scenario scenario) {
        try {
            byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotAs, "image/png", scenario.getName());
        }catch (ScreenshotException e){
            e.printStackTrace();
        }
        driver.quit();

    }
}
