package br.com.greyjoyinformatica.bd;

import br.com.greyjoyinformatica.bean.Aluno;
import br.com.greyjoyinformatica.bean.Matricula;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AlunoBd implements Crud<Aluno> {

    @Override
    public void salvar(Aluno bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void excluir(Aluno bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Aluno consultar(Aluno bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Aluno.findByIdAluno");
        qry.setParameter("idAluno", bean.getIdAluno());
        Object singleResult = qry.getSingleResult();
        if(singleResult!= null) {
            return (Aluno) singleResult;
        } 
        
        return null;
    }

    @Override
    public void alterar(Aluno bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(bean);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Aluno> listar(Aluno bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Aluno.findAll");
        List rl = qry.getResultList();
        if (rl != null) {
            return rl;
        }

        return null;
    }
    
    public Aluno consultarId(int bean) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoLab2ComJPAPU");
        EntityManager em = emf.createEntityManager();

        Query qry = em.createNamedQuery("Aluno.findByIdAluno");
        qry.setParameter("idAluno", bean);
        Object singleResult = qry.getSingleResult();
        if(singleResult!= null) {
            return (Aluno) singleResult;
        } 
        
        return null;
    }
}
