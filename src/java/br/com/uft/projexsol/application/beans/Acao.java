/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PedroLima
 */
@Entity
@Table(name = "acao")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "BemMaterial.findAll", query = "SELECT b FROM BemMaterial b"),
//    @NamedQuery(name = "BemMaterial.findById", query = "SELECT b FROM BemMaterial b WHERE b.id = :id"),
//    @NamedQuery(name = "BemMaterial.findByNumeroSerie", query = "SELECT b FROM BemMaterial b WHERE b.numeroSerie = :numeroSerie"),
//    @NamedQuery(name = "BemMaterial.findByValorCompra", query = "SELECT b FROM BemMaterial b WHERE b.valorCompra = :valorCompra"),
//    @NamedQuery(name = "BemMaterial.findByValorAtual", query = "SELECT b FROM BemMaterial b WHERE b.valorAtual = :valorAtual"),
//    @NamedQuery(name = "BemMaterial.findByObservacao", query = "SELECT b FROM BemMaterial b WHERE b.observacao = :observacao")})

public class Acao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private int codigo;
    @Size(max = 120)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataInicial")
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    @NotNull
    @Column(name = "datafinal")
    @Temporal(TemporalType.DATE)
    private Date dataFinal;
    @Size(max = 200)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 200)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 200)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "acao")
    private ArrayList<Atividade> atividades;

    public Acao(int codigo, String nome, Date dataInicial, Date dataFinal, String tipo, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.tipo = tipo;
        this.descricao = descricao;
        atividades = new ArrayList<>();
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }

}
