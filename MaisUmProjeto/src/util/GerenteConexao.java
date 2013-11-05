/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Emerson
 */
public class GerenteConexao {

    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/ads20122";
    static String user = "root";
    static String passw = "root";
    static Connection con;
    
    private GerenteConexao(){
            
    }
    
    public static Connection getConexao(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, passw);
        } catch (Exception e) {
            e.getMessage();
        }
        return con;
    }
}
