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
public class Projeto {
    private int codigo;
    private Voluntario gerenteProjeto;
    private double custoProjeto;
    private DetalhesProjeto detalhes;

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
