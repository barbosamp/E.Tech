package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.FormularioFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class FormularioSteps {
    private FormularioFuncionalidade formularioFuncionalidade;

    public FormularioSteps(){
        this.formularioFuncionalidade = new FormularioFuncionalidade();
    }

    @E("^preencho o campo nome$")
    public void preenchoOCampoNome() {
        this.formularioFuncionalidade.preencheCampoNome();
    }

    @Entao("^visualizo as informações na tela$")
    public void visualizoAsInformaçõesNaTela() {
        Assert.assertTrue(this.formularioFuncionalidade.validaExistenciaLabelNome());
    }
}
