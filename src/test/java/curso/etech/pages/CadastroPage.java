package curso.etech.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static curso.etech.common.BaseTest.driver;

public class CadastroPage {

    public CadastroPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "etInputtextes")
    private WebElement campoNomeCompleto;

    @AndroidFindBy(id = "etInputtextes1")
    private WebElement campoComoQuerSerChamado;

    @AndroidFindBy(id = "etInputtextes2")
    private WebElement campoTelefone;

    @AndroidFindBy(id = "etInputtextes3")
    private WebElement campoDataNascimento;

    @AndroidFindBy(id = "txtButton")
    private WebElement botaoProsseguir;

    @AndroidFindBy(id = "etInputtextes")
    private WebElement campoCEP;

    @AndroidFindBy(id = "btnCep")
    private WebElement botaoCEP;

    @AndroidFindBy(id = "etInputtextes1")
    private WebElement campoRua;

    @AndroidFindBy(id = "etInputtextes2")
    private WebElement campoBairro;

    @AndroidFindBy(id = "etInputtextes3")
    private WebElement campoCidade;

    @AndroidFindBy(id = "txtTitle")
    private WebElement selectEstado;

     private String aguarde = "progressBar5";

    public String getAguarde() {
        return aguarde;
    }

    @AndroidFindBy(id = "//android.widget.TextView[@text='SP']")
    private WebElement opcaoSP;

    @AndroidFindBy(id = "etInputtextes")
    private WebElement campoEmail;

    @AndroidFindBy(id = "etInputtextes1")
    private WebElement campoSenha;

    @AndroidFindBy(id = "etInputtextes2")
    private WebElement campoConfirmeSenha;

    @AndroidFindBy(id = "btnCriarConta")
    private WebElement botaoCriarConta;



    public WebElement getCampoNomeCompleto() {
        return campoNomeCompleto;
    }

    public WebElement getCampoComoQuerSerChamado() {
        return campoComoQuerSerChamado;
    }

    public WebElement getCampoTelefone() {
        return campoTelefone;
    }

    public WebElement getCampoDataNascimento() {
        return campoDataNascimento;
    }

    public WebElement getBotaoProsseguir() {
        return botaoProsseguir;
    }

    public WebElement getCampoCEP() {
        return campoCEP;
    }

    public WebElement getBotaoCEP() {
        return botaoCEP;
    }

    public WebElement getCampoRua() {
        return campoRua;
    }

    public WebElement getCampoBairro() {
        return campoBairro;
    }

    public WebElement getCampoCidade() {
        return campoCidade;
    }

    public WebElement getSelectEstado() {
        return selectEstado;
    }

    public WebElement getOpcaoSP() {
        return opcaoSP;
    }

    public WebElement getCampoEmail() {
        return campoEmail;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }

    public WebElement getCampoConfirmeSenha() {
        return campoConfirmeSenha;
    }

    public WebElement getBotaoCriarConta() {
        return botaoCriarConta;
    }
}
