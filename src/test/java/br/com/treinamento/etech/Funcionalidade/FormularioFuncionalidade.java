package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.FormularioPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import com.github.javafaker.Faker;
import gherkin.lexer.Fa;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

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
}
