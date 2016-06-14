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
public class ITS {


    private int codigo;
    private String nome;
    private String cnpj;
    private String tipoInstituicao;
    private Endereco endereco;
    private String email;
    private String diretor;
    private String funcao;
    private String telefone;
    private ArrayList<AreaDeInteresses> areasDeInteresses;
    
    public ITS(int codigo, String nome, String cnpj, String tipoInstituicao, Endereco endereco, String email, String diretor, String funcao, String telefone, ArrayList<AreaDeInteresses> areasDeInteresses){
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipoInstituicao = tipoInstituicao;
        this.endereco = endereco;
        this.email = email;
        this.diretor = diretor;
        this.funcao = funcao;
        this.telefone = telefone;
        this.areasDeInteresses = areasDeInteresses;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(String tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<AreaDeInteresses> getAreasDeInteresses() {
        return areasDeInteresses;
    }

    public void setAreasDeInteresses(ArrayList<AreaDeInteresses> areasDeInteresses) {
        this.areasDeInteresses = areasDeInteresses;
    }
    
}
