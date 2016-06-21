/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.application.model;
import br.com.uft.projexsol.application.beans.Voluntario;
import br.com.uft.projexsol.application.util.ProjexSolUtil;
import java.util.List;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.stat.SessionStatistics;
/**
 *
 * @author Rogerio MQ
 */
public class GenericDAO
{
    private static Session sessao;
    private Transaction transacao;
    /** Creates a new instance of GenericDAO */
    public void objInserir( Object obj ) throws Exception
    {
            sessao = ProjexSolUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.save(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public void objAlterar( Object obj ) throws Exception
    {
            sessao = ProjexSolUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.update(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public void objDeletar( Object obj ) throws Exception
    {
            sessao = ProjexSolUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.delete(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public List listar(Class clazz) throws Exception
    {
        sessao = ProjexSolUtil.getSession();
        transacao = sessao.beginTransaction();
        List objts;
        objts = null;
        Criteria selectAll = sessao.createCriteria(clazz);
        transacao.commit();
        objts = selectAll.list();
        sessao.close();
        return objts;
    }
     public Object listar(Class clazz, String pk) throws Exception
    {
        sessao = ProjexSolUtil.getSession();
        transacao = sessao.beginTransaction();
        Voluntario objt = (Voluntario) sessao.load(clazz, new Integer(Integer.parseInt(pk)) );
        transacao.commit();
        sessao.flush();
        sessao.close();
        return objt;
    }
    public void rollBack()
    {
        transacao.rollback();
        sessao.close();
    }
    public void closeConnection() throws Exception
    {
            sessao = ProjexSolUtil.getSession();
            sessao.createQuery("exit").executeUpdate();
    }
}