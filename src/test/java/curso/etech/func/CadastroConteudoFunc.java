package curso.etech.func;

import com.github.javafaker.Faker;
import curso.etech.common.StaticVariables;
import curso.etech.pages.CadastroConteudoPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Locale;
import java.util.Random;

import static curso.etech.common.BaseTest.driver;
import static curso.etech.common.BaseTest.wait;

public class CadastroConteudoFunc {

    Faker faker = new Faker(new Locale("pt-BR"));
    CadastroConteudoPage cadastroConteudoPage = new CadastroConteudoPage();


    public void cadastroConteudo(String conteudo) throws IOException {
        String nomeConteudo = faker.book().title();
        String autor = faker.book().author();
        String descricao = faker.lorem().paragraph(1);
        String anoLancamento = String.valueOf(faker.number().numberBetween(1990, 2023));
        this.selecionarConteudo(conteudo);
        cadastroConteudoPage.getCampoNomeConteudo().sendKeys(nomeConteudo);
        cadastroConteudoPage.getCampoAnoLancamento().sendKeys(anoLancamento);
        cadastroConteudoPage.getCampoLinkDoConteudo().sendKeys("https://etech.dev");
        this.realizarUploadImagem();
        cadastroConteudoPage.getSelecioneGeneroConteudo().click();
        Random random = new Random();
        int genero = random.nextInt(1, 9);
        cadastroConteudoPage.getListaGeneros().get(genero).click();

        int startX = cadastroConteudoPage.getUploadImagem().getLocation().x + (cadastroConteudoPage.getUploadImagem().getSize().width / 2);
        int startY = cadastroConteudoPage.getUploadImagem().getLocation().y;

        int endX= cadastroConteudoPage.getTxtAdicionarConteudo().getLocation().x + (cadastroConteudoPage.getTxtAdicionarConteudo().getSize().width /2);
        int endY = cadastroConteudoPage.getTxtAdicionarConteudo().getLocation().y;

        new TouchAction<>(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX, endY)).release().perform();
        cadastroConteudoPage.getCampoDuracao().sendKeys("145");
        cadastroConteudoPage.getCampoDirecao().sendKeys(autor);
        cadastroConteudoPage.getCampoDescricao().sendKeys(descricao);
        cadastroConteudoPage.getCampoNota().click();
        cadastroConteudoPage.getBotaoCadastrar().click();
    }

    private void selecionarConteudo(String conteudo){
        cadastroConteudoPage.getSelecioneConteudo().click();
        switch (conteudo.toUpperCase()){
            case "FILME":
                cadastroConteudoPage.getOpcaoFilme().click();
                break;
            case "SERIE":
                cadastroConteudoPage.getOpcaoSerie().click();
                break;
            default:
                System.out.println("Opção invalida: " + conteudo);
        }
    }


    private void realizarUploadImagem() throws IOException {
        driver.pushFile("/sdcard/Pictures/LOGO.png", new File(System.getProperty("user.dir") + "\\LOGO.png"));
        cadastroConteudoPage.getUploadImagem().click();
        if (StaticVariables.getDevice().contains("emulator")){
            cadastroConteudoPage.getSelecaoPictures().click();
            cadastroConteudoPage.getSelecionarFoto().click();
        }else {
            cadastroConteudoPage.getListaImagens().get(0).click();
        }
        wait.until(ExpectedConditions.invisibilityOf(cadastroConteudoPage.getCampoAguarde()));
    }

    public String getMensagemCadastroConteudo(){
        return cadastroConteudoPage.getMensagemConteudo().getText();
    }
}
