/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.bd;

import br.com.greyjoyinformatica.bean.Cursos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Christian
 */
public class CursosBd implements Crud<Cursos>{

    @Override
    public void salvar(Cursos bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void excluir(Cursos bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Cursos consultar(Cursos bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Cursos.findByIdCursos");
        qry.setParameter("idCursos", bean.getIdCursos());
        Object singleResult = qry.getSingleResult();
        if(singleResult!=null) {
            return (Cursos) singleResult;
        } 
        
        return null;
    }

    @Override
    public void alterar(Cursos bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List listar(Cursos bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Cursos.findAll");
        List rl = qry.getResultList();
        if (rl != null) {
            return rl;
        }

        return null;
    }
    
    
}
