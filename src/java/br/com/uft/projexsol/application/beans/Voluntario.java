/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author aluno
 */
@Entity
public class Voluntario  implements Serializable{
    @Column
    private String nome;
    @Id
    private int codigo;
    @Column
    private String cpf;
    @Column
    private String rg;
    @Column
    private String login;
    @Column
    private String senha;
    @Column
    private String telefone;
    @Column
    private String celular;
    @Column
    private String email;
    @OneToOne
    private Endereco endereco;
    @OneToMany
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
