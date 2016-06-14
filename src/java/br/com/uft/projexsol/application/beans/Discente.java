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
public class Discente extends Voluntario {
    private Curso curso;
    private ArrayList<Disciplina> disciplinas;

    public Discente(int codigo, String nome, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, Curso curso, ArrayList<Disciplina> diciplinas) {
        super(codigo, nome, cpf, rg, login, senha, telefone, celular, email, endereco);
        this.curso = curso;
        this.disciplinas = diciplinas;
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
