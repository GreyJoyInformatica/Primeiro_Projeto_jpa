package br.com.greyjoyinformatica.bd;

import br.com.greyjoyinformatica.bean.Aluno;
import br.com.greyjoyinformatica.bean.Disciplina;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisciplinaBd implements Crud<Disciplina> {

    @Override
    public void salvar(Disciplina bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void excluir(Disciplina bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Disciplina consultar(Disciplina bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Disciplina.findByIdDisciplina");
        qry.setParameter("idDisciplina", bean.getIdDisciplina());
        Object singleResult = qry.getSingleResult();
        if(singleResult!=null) {
            return (Disciplina) singleResult;
        } 
        
        return null;
    }

    @Override
    public void alterar(Disciplina bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Disciplina> listar(Disciplina bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Disciplina.findAll");
        List rl = qry.getResultList();
        if (rl != null) {
            return rl;
        }

        return null;
    }

   
    
}
