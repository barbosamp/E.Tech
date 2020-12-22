package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;
import org.junit.Assert;

public class HomeSteps {
    private HomeFuncionalidade homeFuncionalidade;

    public HomeSteps(){
       this.homeFuncionalidade = new HomeFuncionalidade();
    }

    @Dado("^que esteja na aplicação$")
    public void queEstejaNaAplicação() {
        Assert.assertTrue(this.homeFuncionalidade.validaAcessoHome());
    }
}
