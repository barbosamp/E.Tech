package br.com.treinamento.etech.commons;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private static AppiumDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> createDriver() {

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            //Qual plataforma de sistema operacional móvel usar
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            //Qual mecanismo de automação usar
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            //Pacote Java do aplicativo Android que você deseja executar.
            cap.setCapability("appPackage", "com.ctappium");
            //Nome da tela que você deseja iniciar a partir do seu pacote.
            cap.setCapability("appActivity", "com.ctappium.MainActivity");
            //explicar a diferença
            //Arquivo que deseja iniciar
            //cap.setCapability(MobileCapabilityType.APP, new File("nome.apk"));
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());

        }

        return driver;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        if (driver == null) {
            return createDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();

    }
}
