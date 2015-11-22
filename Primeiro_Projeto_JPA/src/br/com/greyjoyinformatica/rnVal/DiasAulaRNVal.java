/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.rnVal;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bean.Diasaula;
import java.util.List;


/**
 *
 * @author Christian
 */
public class DiasAulaRnVal implements Crud<Diasaula>{

    @Override
    public void salvar(Diasaula bean) {
        if(bean.getDiaAula().trim().equals("segunda") ||
                bean.getDiaAula().trim().equals("terça") ||
                bean.getDiaAula().trim().equals("quarta") ||
                bean.getDiaAula().trim().equals("quinta") ||
                bean.getDiaAula().trim().equals("sexta") ||
                bean.getDiaAula().trim().equals("sabado") ||
                bean.getDiaAula().trim().equals("domingo")){
        }else{
             throw new RuntimeException("verifique o dia informado");
        }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
