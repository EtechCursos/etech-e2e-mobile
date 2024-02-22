package curso.etech.func;

import curso.etech.pages.HomePage;

public class HomeFunc {

    HomePage homePage = new HomePage();

    public String getPesquisa(){
        return homePage.getPesquisa().getText();
    }

    public void adicionarNovoConteudo(){
        homePage.getBotaoAdicionar().click();
    }
}
