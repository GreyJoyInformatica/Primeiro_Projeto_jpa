/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.bd;


import br.com.greyjoyinformatica.bean.Chamada;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Christian
 */
public class ChamadaBd implements Crud<Chamada>{

    @Override
    public void salvar(Chamada bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void excluir(Chamada bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Chamada consultar(Chamada bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Chamada.findByIdChamada");
        qry.setParameter("idChamada", bean.getIdChamada());
        Object singleResult = qry.getSingleResult();
        if(singleResult!=null) {
            return (Chamada) singleResult;
        } 
        
        return null;
    }

    @Override
    public void alterar(Chamada bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List listar(Chamada bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Chamada.findAll");
        List rl = qry.getResultList();
        if (rl != null) {
            return rl;
        }

        return null;
    }
    
    
}
