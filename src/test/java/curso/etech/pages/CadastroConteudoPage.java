package curso.etech.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static curso.etech.common.BaseTest.driver;

public class CadastroConteudoPage {

    public CadastroConteudoPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "permission_allow_button")
    private WebElement botaoPermissao;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Nome do filme']/ancestor::android.widget.LinearLayout/preceding-sibling::android.widget.Spinner[@resource-id='br.com.filme.app:id/spinnerInputtextes']")
    private WebElement selecioneConteudo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Filme']")
    private WebElement opcaoFilme;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Série']")
    private WebElement opcaoSerie;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Nome d')]")
    private WebElement campoNomeConteudo;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Ano de lançamento']")
    private WebElement campoAnoLancamento;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Link do trailer no youtube']")
    private WebElement campoLinkDoConteudo;
    @AndroidFindBy(id = "btnImage")
    private WebElement uploadImagem;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='br.com.filme.app:id/btnImage']/following-sibling::android.widget.Spinner[@resource-id='br.com.filme.app:id/spinnerInputtextes1']")
    private WebElement selecioneGeneroConteudo;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Duração']")
    private WebElement campoDuracao;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Direção']")
    private WebElement campoDirecao;

    @AndroidFindBy(id = "etOQueVocAchou")
    private WebElement campoDescricao;

    @AndroidFindBy(id = "ratingBar2")
    private WebElement campoNota;

    @AndroidFindBy(id = "btnRegistrarFilmeSerie")
    private WebElement botaoCadastrar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pictures']")
    private WebElement selecaoPictures;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'Photo')]")
    private WebElement selecionarFoto;

    @AndroidFindBy(id = "com.sec.android.gallery3d:id/deco_view_layout")
    private List<WebElement> listaImagens;

    @AndroidFindBy(id = "br.com.filme.app:id/txtTitle")
    private List<WebElement> listaGeneros;

    @AndroidFindBy(id = "progressBarRegister")
    private WebElement campoAguarde;

    @AndroidFindBy(id = "txtAdicioneconte")
    private WebElement txtAdicionarConteudo;

    @AndroidFindBy(id = "snackbar_text")
    private WebElement mensagemConteudo;

    public WebElement getMensagemConteudo() {
        return mensagemConteudo;
    }

    public WebElement getTxtAdicionarConteudo() {
        return txtAdicionarConteudo;
    }

    public List<WebElement> getListaImagens() {
        return listaImagens;
    }

    public WebElement getBotaoPermissao() {
        return botaoPermissao;
    }

    public WebElement getSelecioneConteudo() {
        return selecioneConteudo;
    }

    public WebElement getOpcaoFilme() {
        return opcaoFilme;
    }

    public WebElement getOpcaoSerie() {
        return opcaoSerie;
    }

    public WebElement getCampoNomeConteudo() {
        return campoNomeConteudo;
    }

    public WebElement getCampoAnoLancamento() {
        return campoAnoLancamento;
    }

    public WebElement getCampoLinkDoConteudo() {
        return campoLinkDoConteudo;
    }

    public WebElement getUploadImagem() {
        return uploadImagem;
    }

    public WebElement getSelecioneGeneroConteudo() {
        return selecioneGeneroConteudo;
    }

    public WebElement getCampoDuracao() {
        return campoDuracao;
    }

    public WebElement getCampoDirecao() {
        return campoDirecao;
    }

    public WebElement getCampoDescricao() {
        return campoDescricao;
    }

    public WebElement getCampoNota() {
        return campoNota;
    }

    public WebElement getBotaoCadastrar() {
        return botaoCadastrar;
    }

    public WebElement getSelecaoPictures() {
        return selecaoPictures;
    }

    public WebElement getSelecionarFoto() {
        return selecionarFoto;
    }

    public List<WebElement> getListaGeneros() {
        return listaGeneros;
    }

    public WebElement getCampoAguarde() {
        return campoAguarde;
    }
}
