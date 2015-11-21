/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.bd;

import br.com.greyjoyinformatica.bean.Diasaula;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Christian
 */
public class DiasAulaBd implements Crud<Diasaula>{

    @Override
    public void salvar(Diasaula bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bean);
        em.getTransaction().commit();
        em.close();  
    }

    @Override
    public void excluir(Diasaula bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Diasaula consultar(Diasaula bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Diasaula.findByIdDiasAula");
        qry.setParameter("idDiasAula", bean.getIdDiasAula());
        Object singleResult = qry.getSingleResult();
        if(singleResult!=null) {
            return (Diasaula) singleResult;
        } 
        
        return null;
    }

    @Override
    public void alterar(Diasaula bean) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List listar(Diasaula bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Diasaula.findAll");
        List rl = qry.getResultList();
        if (rl != null) {
            return rl;
        }

        return null;
    }
    
}
