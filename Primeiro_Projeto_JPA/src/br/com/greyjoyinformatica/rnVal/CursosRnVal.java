/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.rnVal;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bean.Cursos;
import java.util.List;

/**
 *
 * @author Christian
 */
public class CursosRnVal implements Crud<Cursos>{

    @Override
    public void salvar(Cursos bean) {
        if(bean.getNomeCurso().trim().length() < 2){
            throw new RuntimeException("preencha todos os campos");
        }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
