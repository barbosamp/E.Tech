package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.FormularioPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormularioFuncionalidade extends BaseTest {

    private FormularioPage formularioPage;
    private AppiumRobot appiumRobot;
    private String nome;
    private Faker faker;

    public FormularioFuncionalidade(){
        this.formularioPage = new FormularioPage(driver);
        this.appiumRobot = new AppiumRobot();
        this.faker = new Faker();
    }

    public void preencheCampoNome(){
        driverWait.until(ExpectedConditions.visibilityOf(this.formularioPage.getNome_txt()));
        nome = faker.name().fullName();
        this.formularioPage.getNome_txt().sendKeys(nome);
    }

    public boolean validaExistenciaLabelNome(){
        return this.appiumRobot.validaExistenciaTexto("Nome: "+ nome);
    }

    public boolean validaExistenciaLabelConsole() {
        return this.appiumRobot.validaExistenciaTexto("Console: xone");
    }

    public boolean validaExistenciaCheckboxMarcado() {
        return this.appiumRobot.validaExistenciaTexto("Checkbox: Marcado");
    }

    public void selecionarLista() {
        this.formularioPage.getLista().click();
        driverWait.until(ExpectedConditions.visibilityOf(this.formularioPage.getOpcaoListaXBox()));
        this.formularioPage.getOpcaoListaXBox().click();

    }

    public void selecionarCheckBox(){
        this.formularioPage.getCheckbox().click();
    }


}
