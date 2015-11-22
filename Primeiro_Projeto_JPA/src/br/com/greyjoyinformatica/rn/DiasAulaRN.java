package br.com.greyjoyinformatica.rn;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bd.DiasAulaBd;
import br.com.greyjoyinformatica.bean.Diasaula;
import br.com.greyjoyinformatica.rnVal.DiasAulaRnVal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class DiasAulaRn implements Crud<Diasaula>{

    @Override
    public void salvar(Diasaula bean) {
        new DiasAulaRnVal().salvar(bean);
        new DiasAulaBd().salvar(bean);
    }

    @Override
    public void excluir(Diasaula bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diasaula consultar(Diasaula bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Diasaula bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar(Diasaula bean) {
        return new DiasAulaBd().listar(bean);
        
    }

}
