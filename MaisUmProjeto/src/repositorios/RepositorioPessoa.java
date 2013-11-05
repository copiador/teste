/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import modelos.Pessoa;
import util.GerenteConexao;

/**
 *
 * @author Emerson
 */
public class RepositorioPessoa {
    
    public void salvarPessoa(Pessoa p){
        String sql = "insert into pessoas(id, nome, telefone) values(?,?,?)";
        
        try {
            PreparedStatement ps = GerenteConexao.getConexao().prepareStatement(sql);
            ps.setLong(1, p.getId());
            ps.setString(2, p.getNome());
            ps.setString(3, p.getTelefone());
            
            ps.executeUpdate();
            System.out.println(p.getNome()+" Salvo com sucesso!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void removerPessoa(Pessoa p){
        String sql = "delete from pessoas where id = ?";
        try{
            PreparedStatement ps = GerenteConexao.getConexao().prepareStatement(sql);
            ps.setLong(1, p.getId());
            
            System.out.println("Removendo a Pessoa com o ID = "+p.getId()+" e nome = "+p.getNome());
            
            ps.executeUpdate();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void listarPessoas(){
        String sql = "Select ID, NOME, TELEFONE from pessoas";
        
        try {
            Statement st = GerenteConexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {                
                System.out.println("ID: "+rs.getString("ID"));
                System.out.println("NOME: "+rs.getString("NOME"));
                System.out.println("TELEFONE: "+rs.getString("TELEFONE"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void alterarPessoa(Pessoa p){
        String sql = "update pessoas set id =? AND nome =? AND telefone =? where id ="+p.getId();
        
        try {
            PreparedStatement ps = GerenteConexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, p.getId());
            ps.setString(2, p.getNome());
            ps.setString(3, p.getTelefone());
            //ps.setLong(3, p.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
