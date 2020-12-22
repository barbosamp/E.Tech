package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FormularioPage {

    public FormularioPage(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this );
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='nome']")
    private MobileElement nome_txt;

    @AndroidFindBy(xpath = "//android.widget.Spinner[@content-desc='console']")
    private MobileElement lista;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='XBox One']")
    private MobileElement opcaoLista;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='check']")
    private MobileElement checkbox;


    public MobileElement getNome_txt() {
        return nome_txt;
    }
    public MobileElement getLista() { return lista; }
    public MobileElement getOpcaoListaXBox() { return opcaoLista; }
    public MobileElement getCheckbox() {return checkbox; }




}
