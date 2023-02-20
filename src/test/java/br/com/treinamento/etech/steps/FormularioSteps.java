package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.FormularioFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
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

    @E("^preencho o campo sobrenome$")
    public void preenchoOCampoNome() {
        this.formularioFuncionalidade.preencheCampoSobrenome();
    }

    @Entao("^visualizo as informações na tela$")
    public void visualizoAsInformaçõesNaTela() {
        Assert.assertTrue(this.formularioFuncionalidade.validaExistenciaLabelNome());
    }

    @E("^preencho os campos necessários$")
    public void preenchoOsCamposNecessários() {
        this.formularioFuncionalidade.preencheCampoNome();
        this.formularioFuncionalidade.selecionarLista();
        this.formularioFuncionalidade.selecionarCheckBox();

    }

    @Então("^visualizo as informações necessárias na tela$")
    public void visualizoAsInformaçõesNecessáriasNaTela() {
        Assert.assertTrue(this.formularioFuncionalidade.validaExistenciaLabelNome());
        Assert.assertTrue(this.formularioFuncionalidade.validaExistenciaLabelConsole());
        Assert.assertTrue(this.formularioFuncionalidade.validaExistenciaCheckboxMarcado());
    }
}
