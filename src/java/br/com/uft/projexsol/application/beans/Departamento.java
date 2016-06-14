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
public class Departamento {
    private int codigo;
    private String nome;
    private ArrayList<Curso> cursos;

    public Departamento(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.cursos = new ArrayList<Curso>();
    }
    public void addCurso(Curso curso){
        cursos.add(curso);
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

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
    
}
