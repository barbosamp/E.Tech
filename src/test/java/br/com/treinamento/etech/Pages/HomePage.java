package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this );
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Formulário']")
    private MobileElement btn_formulario;

    public MobileElement getBtn_formulario() {
        return btn_formulario;
    }
}
