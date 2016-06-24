/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.beans;

import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

/**
 *
 * @author PedroLima
 */
public class ITS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private int codigo;
    @Size(max = 120)
    private String nome;
    @Size(max = 18)
    private String cnpj;
    @Size(max = 20)
    private String tipoInstituicao;
    @Size(max = 200)
    private Endereco endereco;
    @Size(max = 60)
    private String email;
    @Size(max = 120)
    private String diretor;
    @Size(max = 60)
    private String funcao;
    @Size(max = 60)
    private String telefone;
    @OneToMany
    private ArrayList<AreaDeInteresses> areasDeInteresses;

    public ITS(int codigo, String nome, String cnpj, String tipoInstituicao, Endereco endereco, String email, String diretor, String funcao, String telefone, ArrayList<AreaDeInteresses> areasDeInteresses) {
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
