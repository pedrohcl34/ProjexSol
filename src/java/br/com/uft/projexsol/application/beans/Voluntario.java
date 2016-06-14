/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.beans;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */

public class Voluntario {
    private String nome;
    private int codigo;
    private String cpf;
    private String rg;
    private String login;
    private String senha;
    private String telefone;
    private String celular;
    private String email;
    private Endereco endereco;
    private ArrayList<AreaDeInteresses> areasDeInteresses;
    
    
    public Voluntario(int codigo, String nome, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, ArrayList<AreaDeInteresses> areasDeInteresses){
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        setLogin(login);
        setSenha(senha);
        setTelefone(telefone);
        setCelular(celular);
        setEmail(email);
        setEndereco(endereco);
        this.areasDeInteresses = areasDeInteresses;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
    
    
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
