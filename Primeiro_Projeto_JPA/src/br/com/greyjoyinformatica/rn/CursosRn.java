/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.rn;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bd.CursosBd;
import br.com.greyjoyinformatica.bean.Cursos;
import br.com.greyjoyinformatica.rnVal.CursosRnVal;
import java.util.List;

/**
 *
 * @author Christian
 */
public class CursosRn implements Crud<Cursos>{

    @Override
    public void salvar(Cursos bean) {
        new CursosRnVal().salvar(bean);
        new CursosBd().salvar(bean);
    }

    @Override
    public void excluir(Cursos bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cursos consultar(Cursos bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Cursos bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar(Cursos bean) {
        return new CursosBd().listar(bean);
    }

    
}
