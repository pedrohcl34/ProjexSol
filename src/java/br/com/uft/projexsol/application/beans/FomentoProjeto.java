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
public class FomentoProjeto {
    private String descricao;
    private String origens;

    public FomentoProjeto(String descricao, String origens) {
        this.descricao = descricao;
        this.origens = origens;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrigens() {
        return origens;
    }

    public void setOrigens(String origens) {
        this.origens = origens;
    }
    
}
