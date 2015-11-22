/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.rn;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bd.MatriculaBd;
import br.com.greyjoyinformatica.bean.Matricula;
import br.com.greyjoyinformatica.rnVal.MatriculaRnVal;
import java.util.List;

/**
 *
 * @author Christian
 */
public class MatriculaRn implements Crud<Matricula>{

    @Override
    public void salvar(Matricula bean) {
        new MatriculaRnVal().salvar(bean);
        new MatriculaBd().salvar(bean);
    }

    @Override
    public void excluir(Matricula bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Matricula consultar(Matricula bean) {
        return new MatriculaBd().consultar(bean);
    }

    @Override
    public void alterar(Matricula bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar(Matricula bean) {
        return new MatriculaBd().listar(bean);
    }
     
    public List Chamada(Matricula bean) {
        return new MatriculaBd().Chamada(bean);
    }
}
