package br.com.greyjoyinformatica.rn;
import br.com.greyjoyinformatica.bd.ChamadaBd;
import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bean.Chamada;
import br.com.greyjoyinformatica.rnVal.ChamadaRnVal;
import java.util.List;

/**
 *
 * @author Christian
 */
public class ChamadaRn implements Crud<Chamada>{

    @Override
    public void salvar(Chamada bean) {
        new ChamadaRnVal().salvar(bean);
        new ChamadaBd().salvar(bean);
    }

    @Override
    public void excluir(Chamada bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Chamada consultar(Chamada bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Chamada bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar(Chamada bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
