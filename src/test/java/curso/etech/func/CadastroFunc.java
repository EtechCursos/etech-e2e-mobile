package curso.etech.func;

import com.github.javafaker.Faker;
import curso.etech.common.StaticVariables;
import curso.etech.pages.CadastroPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.util.Locale;

import static curso.etech.common.BaseTest.wait;

public class CadastroFunc {

    CadastroPage cadastroPage = new CadastroPage();

    Faker faker = new Faker(new Locale("pt-BR"));

    public void preencherDadosUsuario() {
        SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
        String data = formate.format(faker.date().birthday());
        String nomeCompleto = faker.name().fullName();
        String nome = faker.name().firstName();
        String telefone = faker.phoneNumber().cellPhone();

        cadastroPage.getCampoNomeCompleto().sendKeys(nomeCompleto);
        cadastroPage.getCampoComoQuerSerChamado().sendKeys(nome);
        cadastroPage.getCampoTelefone().sendKeys(telefone);
        cadastroPage.getCampoDataNascimento().sendKeys(data);
        cadastroPage.getBotaoProsseguir().click();
    }

    public void preencherEnderecoUsuario() {
        cadastroPage.getCampoCEP().sendKeys("01001001");
        cadastroPage.getBotaoCEP().click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(cadastroPage.getAguarde())));
        cadastroPage.getBotaoProsseguir().click();
    }

    public void preencherLoginUsuario() {
        String email = faker.internet().emailAddress();
        StaticVariables.setEmail(email);
        cadastroPage.getCampoEmail().sendKeys(email);
        cadastroPage.getCampoSenha().sendKeys("Teste@123");
        cadastroPage.getCampoConfirmeSenha().sendKeys("Teste@123");
        cadastroPage.getBotaoCriarConta().click();
    }
}
