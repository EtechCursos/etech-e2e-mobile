package curso.etech.steps;

import curso.etech.func.CadastroConteudoFunc;
import curso.etech.func.HomeFunc;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

public class CadastroConteudoStep {

    HomeFunc homeFunc = new HomeFunc();
    CadastroConteudoFunc cadastroConteudoFunc = new CadastroConteudoFunc();

    @Quando("adicionar o conteudo to tipo {string}")
    public void adicionarOConteudoToTipoConteudo(String conteudo) throws IOException {
        homeFunc.adicionarNovoConteudo();
        cadastroConteudoFunc.cadastroConteudo(conteudo);
    }

    @Então("deve exibir a mensagem {string} após realizar o cadastro do conteudo com sucesso")
    public void deveExibirAMensagemMensagemApósRealizarOCadastroDoConteudoComSucesso(String mensagem) {
        Assertions.assertEquals(mensagem, cadastroConteudoFunc.getMensagemCadastroConteudo());
    }
}
