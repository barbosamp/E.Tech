package br.com.treinamento.etech.runTest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, plugin = {"pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
        features = {"./src/test/resources/"}, glue = {
        "br.com.treinamento.etech.steps",
        "br.com.treinamento.etech.configuration",
        "br.com.treinamento.etech.commons"},
        tags = {"@mobile"})

public class RunTest {
}
