/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.beans;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PedroLima
 */
public class Atividade {
    private int codigo;
    private String nomeAtividae;
    private ArrayList<Beneficiario> beneficiarios;
    private Endereco local;
    private Timestamp horario;
    private Date dataInicio;
    private Date dataFinal;

    public Atividade(int codigo, String nomeAtividae, ArrayList<Beneficiario> beneficiarios, Endereco local, Timestamp horario, Date dataInicio, Date dataFinal) {
        this.codigo = codigo;
        this.nomeAtividae = nomeAtividae;
        this.beneficiarios = beneficiarios;
        this.local = local;
        this.horario = horario;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeAtividae() {
        return nomeAtividae;
    }

    public void setNomeAtividae(String nomeAtividae) {
        this.nomeAtividae = nomeAtividae;
    }

    public ArrayList<Beneficiario> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(ArrayList<Beneficiario> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }

    public Endereco getLocal() {
        return local;
    }

    public void setLocal(Endereco local) {
        this.local = local;
    }

    public Timestamp getHorario() {
        return horario;
    }

    public void setHorario(Timestamp horario) {
        this.horario = horario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
}
