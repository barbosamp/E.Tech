package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.HomeFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import org.junit.Assert;

public class HomeSteps {
    private HomeFuncionalidade homeFuncionalidade;
    private AppiumRobot appiumRobot;

    public HomeSteps(){
       this.homeFuncionalidade = new HomeFuncionalidade();
       this.appiumRobot = new AppiumRobot();
    }

    @Dado("^que esteja na aplicação$")
    public void queEstejaNaAplicação() {
        Assert.assertTrue(this.homeFuncionalidade.validaAcessoHome());
    }

    @E("^toco no botão \"([^\"]*)\"$")
    public void tocoNoBotão(String texto){
        this.appiumRobot.clicarPorTexto(texto);
    }
}
