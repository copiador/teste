/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import fachada.Fachada;
import modelos.Pessoa;

/**
 *
 * @author Emerson
 */
public class TesteFachada {

    public static void main(String[] args) {
        try {
            Fachada f = Fachada.getInstancia();
            Pessoa p = new Pessoa();
            
            p.setId(2L);
            p.setNome("Sophia Castelo Branco");
            p.setTelefone("777777777");
            
            //f.salvarPessoa(p);
            //f.removerPessoa(p);
            //f.listarPessoas();
            f.alterarPessoa(p);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
