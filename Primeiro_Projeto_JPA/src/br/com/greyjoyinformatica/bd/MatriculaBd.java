/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.bd;

import br.com.greyjoyinformatica.bean.Matricula;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Christian
 */
public class MatriculaBd implements Crud<Matricula>{

    @Override
    public void salvar(Matricula bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void excluir(Matricula bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Matricula consultar(Matricula bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Mtricula.findByIdMatricula");
        qry.setParameter("idMatricula", bean.getIdMatricula());
        Object singleResult = qry.getSingleResult();
        if(singleResult!=null) {
            return (Matricula) singleResult;
        } 
        
        return null;
    }
    

    @Override
    public void alterar(Matricula bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List listar(Matricula bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Matricula.findAll");
        List rl = qry.getResultList();
        if (rl != null) {
            return rl;
        }

        return null;
    }
    
}
