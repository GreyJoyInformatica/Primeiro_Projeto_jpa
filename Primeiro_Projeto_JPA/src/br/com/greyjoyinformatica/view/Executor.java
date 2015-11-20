/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.view;

import br.com.greyjoyinformatica.bean.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Christian
 */
public class Executor {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        
        Aluno aluno = new Aluno();
        aluno.setEmailAluno("christian burgar");
        aluno.setNomeAluno("cburgard@moderna");
        aluno.setMatriculaAluno("201520000");
        
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        em.close();
    }
}
