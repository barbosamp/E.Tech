package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.HomePage;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeFuncionalidade extends BaseTest {
    private HomePage homePage;

    public HomeFuncionalidade(){
        this.homePage = new HomePage(driver);
    }

    public boolean validaAcessoHome(){
        driverWait.until(ExpectedConditions.visibilityOf(homePage.getBtn_formulario()));
        return homePage.getBtn_formulario().isDisplayed();
    }
}
