/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import controladores.ControladorPessoa;
import modelos.Pessoa;

/**
 *
 * @author Emerson
 */
public class Fachada {
    
    private static Fachada instancia;
    private ControladorPessoa cp;
    
    private Fachada(){
        iniciarContoladores();
    }
    
    public static Fachada getInstancia(){
        if (instancia == null){
             instancia = new Fachada();
        }
        return instancia;
    }
    
    private void iniciarContoladores(){
        cp = new ControladorPessoa();
    }
    
    public void salvarPessoa(Pessoa p){
        cp.salvarPessoa(p);
    }
    
    public void removerPessoa(Pessoa p){
        cp.removerPessoa(p);
    }
    
    public void listarPessoas(){
        cp.listarPessoas();
    }
    
    public void alterarPessoa(Pessoa p){
        cp.alterarPessoa(p);
    }
}
