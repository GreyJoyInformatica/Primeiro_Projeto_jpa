package br.com.greyjoyinformatica.rnVal;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bean.Chamada;
import java.util.List;

/**
 *
 * @author Christian
 */
public class ChamadaRnVal implements Crud<Chamada>{

    @Override
    public void salvar(Chamada bean) {
        if(bean.getAlunoidAluno() == 0 ||  bean.getDisciplinaIdDisciplina() == 0){
            throw new RuntimeException("verifique os campos informados");
        }
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
