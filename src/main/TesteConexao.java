
package main;


import DAO.ConnectionFactory;
import java.sql.Connection;


public class TesteConexao {
    
     public static void main(String[] args) {

        Connection conn = ConnectionFactory.getConnection();

        if (conn != null) {
            System.out.println("Conexão com banco OK");
        } else {
            System.out.println("Falha na conexão");
        }
    }
    
}
