/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.greyjoyinformatica.rnVal;

import br.com.greyjoyinformatica.bd.Crud;
import br.com.greyjoyinformatica.bean.Matricula;
import java.util.List;

/**
 *
 * @author Christian
 */
public class MatriculaRnVal implements Crud<Matricula>{

    @Override
    public void salvar(Matricula bean) {
        if(bean.getAlunoidAluno() == 0 || bean.getDisciplinaidDisciplina() == 0){
            throw new RuntimeException("selecione Aluno e Disciplina para a matricula");
        }
    }

    @Override
    public void excluir(Matricula bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Matricula consultar(Matricula bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Matricula bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar(Matricula bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
