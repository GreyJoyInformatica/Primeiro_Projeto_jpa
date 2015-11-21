package br.com.greyjoyinformatica.rnVal;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bean.Aluno;
import java.util.List;


/**
 *
 * @author Christian
 */
public class AlunoRnVal implements Crud<Aluno>{

   
    @Override
    public void salvar(Aluno aluno) {
        if(aluno.getNomeAluno().trim().length() < 2
                || aluno.getEmailAluno().trim().length() < 2
                || aluno.getMatriculaAluno().trim().length() < 2){
            throw new RuntimeException("Confira os campos informados");
        }
    }
    
    @Override
    public void excluir(Aluno bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno consultar(Aluno bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Aluno bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar(Aluno bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
