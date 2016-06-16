/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.beans;

import java.util.ArrayList;

/**
 *
 * @author PedroLima
 */
public class Oportunidade {
    private int codigo;
    private String nome;
    private String descricao;
    private AreaDeInteresses areaDeInteresses;
    private ArrayList<Voluntario> voluntarios;
    public Oportunidade(int codigo, String nome, String descricao, AreaDeInteresses areaDeInteresses) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.areaDeInteresses = areaDeInteresses;
        voluntarios = new ArrayList<>();
        
    }
    
    
    public void addVoluntario(Voluntario voluntario){
        voluntarios.add(voluntario);
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public AreaDeInteresses getAreaDeInteresses() {
        return areaDeInteresses;
    }

    public void setAreaDeInteresses(AreaDeInteresses areaDeInteresses) {
        this.areaDeInteresses = areaDeInteresses;
    }
    
}
