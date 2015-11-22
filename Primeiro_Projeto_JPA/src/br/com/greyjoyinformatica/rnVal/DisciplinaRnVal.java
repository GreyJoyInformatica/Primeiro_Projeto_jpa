package br.com.greyjoyinformatica.rnVal;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bean.Disciplina;
import java.util.List;

/**
 *
 * @author Christian
 */
public class DisciplinaRnVal implements Crud<Disciplina>{

    @Override
    public void salvar(Disciplina bean) {
        if(bean.getNomeDisciplina().trim().length() < 2 || bean.getDiasAulaidDiasAula() == 0 || bean.getCursosidCursos() == 0){
            throw new RuntimeException("verifique os campos digitados");
        }
    }

    @Override
    public void excluir(Disciplina bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Disciplina consultar(Disciplina bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Disciplina bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar(Disciplina bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
