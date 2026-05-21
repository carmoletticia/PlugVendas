
package DAO;

import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnderecoDAO {
    
    private Connection conn;

    public EnderecoDAO(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Endereco endereco) throws Exception {

        String sql = "INSERT INTO endereco (idCliente, rua, bairro, cep, cidade) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, endereco.getIdCliente());
        stmt.setString(2, endereco.getRua());
        stmt.setString(3, endereco.getBairro());
        stmt.setString(4, endereco.getCep());
        stmt.setString(5, endereco.getCidade());

        stmt.execute();
        stmt.close();
    }
    
}
