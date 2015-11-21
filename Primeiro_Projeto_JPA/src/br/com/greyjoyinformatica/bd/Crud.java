package br.com.greyjoyinformatica.bd;

import java.util.List;

/**
 *
 * @author Christian
 */
public interface Crud<T> {
    
    void salvar(T bean);
    void excluir(T bean);
    T consultar(T bean);
    void alterar(T bean);
    List listar(T bean);
}
