/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.beans;

/**
 *
 * @author aluno
 */
public class Administrador  extends Voluntario{

    public Administrador(int codigo, String nome, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco) {
        super(codigo, nome, cpf, rg, login, senha, telefone, celular, email, endereco);
    }
    
}
