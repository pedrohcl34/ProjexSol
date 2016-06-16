/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.beans;

/**
 *
 * @author PedroLima
 */
public class DetalhesProjeto {
    private int codigo;
    private String justificativa;
    private String objetivos;
    private String metas;
    private String metodologia;
    private String sistemaDeAvaliacao;
    private String bibliografiaBasica;
    private String convenio;

    public DetalhesProjeto(int codigo, String justificativa, String objetivos, String metas, String metodologia, String sistemaDeAvaliacao, String bibliografiaBasica, String convenio) {
        this.codigo = codigo;
        this.justificativa = justificativa;
        this.objetivos = objetivos;
        this.metas = metas;
        this.metodologia = metodologia;
        this.sistemaDeAvaliacao = sistemaDeAvaliacao;
        this.bibliografiaBasica = bibliografiaBasica;
        this.convenio = convenio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getSistemaDeAvaliacao() {
        return sistemaDeAvaliacao;
    }

    public void setSistemaDeAvaliacao(String sistemaDeAvaliacao) {
        this.sistemaDeAvaliacao = sistemaDeAvaliacao;
    }

    public String getBibliografiaBasica() {
        return bibliografiaBasica;
    }

    public void setBibliografiaBasica(String bibliografiaBasica) {
        this.bibliografiaBasica = bibliografiaBasica;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
}
