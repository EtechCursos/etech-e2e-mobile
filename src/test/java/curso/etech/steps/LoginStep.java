package curso.etech.steps;

import curso.etech.api.usuarios.DeletarUsuarioApi;
import curso.etech.func.LoginFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();
    DeletarUsuarioApi deletarUsuario = new DeletarUsuarioApi();
    @Quando("inserir os dados de usuário")
    public void inserirDadosUsuario(DataTable dataTable){
        List<Map<String, String>> maps = dataTable.asMaps();
        String email = maps.get(0).get("email");
        String senha = maps.get(0).get("senha");
        loginFunc.realizarLogin(email, senha);
    }


    @Então("deve realizar o cadastro com sucesso")
    public void deveRealizarOCadastroComSucesso() {
        Assertions.assertEquals("Quero criar uma conta", loginFunc.getCriarConta());
        deletarUsuario.deleteUsuarioId();
    }
}
