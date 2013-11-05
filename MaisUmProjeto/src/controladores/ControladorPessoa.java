/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Pessoa;
import repositorios.RepositorioPessoa;

/**
 *
 * @author Emerson
 */
public class ControladorPessoa {
    private RepositorioPessoa rp;
    
    public ControladorPessoa(){
        rp = new RepositorioPessoa();
    }
    
    public void salvarPessoa(Pessoa p){
        rp.salvarPessoa(p);
    }
    
    public void removerPessoa(Pessoa p){
        rp.removerPessoa(p);
    }
    
    public void listarPessoas(){
        rp.listarPessoas();
    }
    
    public void alterarPessoa(Pessoa p){
        rp.alterarPessoa(p);
    }
}
