/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.rn;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bd.DisciplinaBd;
import br.com.greyjoyinformatica.bean.Disciplina;
import br.com.greyjoyinformatica.rnVal.DisciplinaRnVal;
import java.util.List;

/**
 *
 * @author Christian
 */
public class DisciplinaRn implements Crud<Disciplina>{

    @Override
    public void salvar(Disciplina bean) {
        new DisciplinaRnVal().salvar(bean);
        new DisciplinaBd().salvar(bean);
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
        return new DisciplinaBd().listar(bean);
    }

}
