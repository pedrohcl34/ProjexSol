/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.beans;

import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author PedroLima
 */
public class Projeto {
    private int codigo;
    private Voluntario gerenteProjeto;
    private double custoProjeto;
    private DetalhesProjeto detalhes;
    private Date dataCriacao;
    private String linhaProgramatica;
    private String areaDirex;
    private String linhaDirex;
    private String numOrdemDirex;
    private String numRegistroDirex;
    private Date dataInicial;
    private Date dataFinal;
    private ArrayList<AreaDeInteresses> areasDeInteresses;
    private FomentoProjeto dadosFomento;
    private boolean autorizado;
    private ArrayList<Oportunidade> oportunidades;
    private ITS instituicaoTerceiroSetor;

    public ITS getInstituicaoTerceiroSetor() {
        return instituicaoTerceiroSetor;
    }

    public void setInstituicaoTerceiroSetor(ITS instituicaoTerceiroSetor) {
        this.instituicaoTerceiroSetor = instituicaoTerceiroSetor;
    }

    public ArrayList<Oportunidade> getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(ArrayList<Oportunidade> oportunidades) {
        this.oportunidades = oportunidades;
    }
    
    
    public boolean autorizado() {
        return autorizado;
    }

    public void autorizar(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public ArrayList<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(ArrayList<Acao> acoes) {
        this.acoes = acoes;
    }
    
    private ArrayList<Acao> acoes;

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getLinhaProgramatica() {
        return linhaProgramatica;
    }

    public void setLinhaProgramatica(String linhaProgramatica) {
        this.linhaProgramatica = linhaProgramatica;
    }

    public String getAreaDirex() {
        return areaDirex;
    }

    public void setAreaDirex(String areaDirex) {
        this.areaDirex = areaDirex;
    }

    public String getLinhaDirex() {
        return linhaDirex;
    }

    public void setLinhaDirex(String linhaDirex) {
        this.linhaDirex = linhaDirex;
    }

    public String getNumOrdemDirex() {
        return numOrdemDirex;
    }

    public void setNumOrdemDirex(String numOrdemDirex) {
        this.numOrdemDirex = numOrdemDirex;
    }

    public String getNumRegistroDirex() {
        return numRegistroDirex;
    }

    public void setNumRegistroDirex(String numRegistroDirex) {
        this.numRegistroDirex = numRegistroDirex;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public ArrayList<AreaDeInteresses> getAreasDeInteresses() {
        return areasDeInteresses;
    }

    public void setAreasDeInteresses(ArrayList<AreaDeInteresses> areasDeInteresses) {
        this.areasDeInteresses = areasDeInteresses;
    }

    public FomentoProjeto getDadosFomento() {
        return dadosFomento;
    }

    public void setDadosFomento(FomentoProjeto dadosFomento) {
        this.dadosFomento = dadosFomento;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Voluntario getGerenteProjeto() {
        return gerenteProjeto;
    }

    public void setGerenteProjeto(Voluntario gerenteProjeto) {
        this.gerenteProjeto = gerenteProjeto;
    }

    public double getCustoProjeto() {
        return custoProjeto;
    }

    public void setCustoProjeto(double custoProjeto) {
        this.custoProjeto = custoProjeto;
    }

    public DetalhesProjeto getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(DetalhesProjeto detalhes) {
        this.detalhes = detalhes;
    }
    
    
}
