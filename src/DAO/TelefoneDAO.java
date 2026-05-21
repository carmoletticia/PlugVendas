
package DAO;
import Model.Telefone;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TelefoneDAO {
    private Connection conn;

    public TelefoneDAO(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Telefone telefone) throws Exception {

        String sql = "INSERT INTO telefone (idCliente, ddd, numero) VALUES (?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, telefone.getIdCliente());
        stmt.setString(2, telefone.getDdd());
        stmt.setString(3, telefone.getNumero());

        stmt.execute();
        stmt.close();
    }
}
