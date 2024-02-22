package curso.etech.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static curso.etech.common.BaseTest.driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "edtSearch")
    private WebElement pesquisa;

    @AndroidFindBy(id = "floatingBtnFloatingactionbutton")
    private WebElement botaoAdicionar;

    public WebElement getPesquisa() {
        return pesquisa;
    }

    public WebElement getBotaoAdicionar() {
        return botaoAdicionar;
    }
}
