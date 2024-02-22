package curso.etech.steps;

import curso.etech.func.HomeFunc;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;

public class HomeStep {

    HomeFunc homeFunc = new HomeFunc();

    @Então("deve realizar o login com sucesso")
    public void deveRealizarOLoginComSucesso() {
        Assertions.assertEquals("O que você procura?", homeFunc.getPesquisa());
    }


}
