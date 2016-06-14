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
public class Docente extends Voluntario{
    private Curso curso;
    private Departamento departamento;

    public Docente(int codigo, String nome, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, Curso curso, ArrayList<AreaDeInteresses> areasDeInteresses,Departamento departamento) {
        super(codigo, nome, cpf, rg, login, senha, telefone, celular, email, endereco,areasDeInteresses);
        this.curso = curso;
        this.departamento = departamento;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
