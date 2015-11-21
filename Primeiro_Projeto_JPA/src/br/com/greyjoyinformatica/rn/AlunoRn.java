package br.com.greyjoyinformatica.rn;

import br.com.greyjoyinformatica.bd.AlunoBd;
import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bean.Aluno;
import br.com.greyjoyinformatica.rnVal.AlunoRnVal;
import java.util.List;


/**
 *
 * @author Christian
 */
public class AlunoRn implements Crud<Aluno> {

    @Override
    public void salvar(Aluno aluno) {        
        new AlunoRnVal().salvar(aluno);
        new AlunoBd().salvar(aluno);
    }

    @Override
    public void excluir(Aluno bean) {
        new AlunoRnVal().excluir(bean);
        new AlunoBd().excluir(bean);
    }

    @Override
    public Aluno consultar(Aluno bean) {
        new AlunoRnVal().consultar(bean);
        return new AlunoBd().consultar(bean);
    }

    @Override
    public void alterar(Aluno bean) {
        new AlunoRnVal().alterar(bean);
        new AlunoBd().alterar(bean);
    }

    @Override
    public List<Aluno> listar(Aluno bean) {
        return new AlunoBd().listar(bean);
    }
    
    
}
