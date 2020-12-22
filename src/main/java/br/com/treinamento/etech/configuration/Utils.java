package br.com.treinamento.etech.configuration;

import br.com.treinamento.etech.commons.BaseTest;
import cucumber.api.Scenario;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utils {


    public static File gerarScreenShot(Scenario scenario){
        File imagem = ((TakesScreenshot) BaseTest.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(imagem, (new File("./evidence", scenario.getName() + " - " + scenario.getStatus().toUpperCase() + ".png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagem;
    }


    public static void embedScreenshot(File file, String description) {
        Path content = Paths.get(file.getPath());
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment(description, is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}