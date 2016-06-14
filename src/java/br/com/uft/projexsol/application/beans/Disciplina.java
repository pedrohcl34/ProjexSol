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
public class Disciplina {
    private int codigo;
    private String nome;
    private Curso curso;
    private Docente docente;
    
    public Disciplina(int codigo, String nome, Curso curso, Docente docente){
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
        this.docente = docente;
    }
    public String getNome(){
     return nome;   
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
