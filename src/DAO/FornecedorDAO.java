
package DAO;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {
    
    public void salvar(Fornecedor fornecedor) {

        String sql = "INSERT INTO fornecedor (nome_empresa, cnpj, contato) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, fornecedor.getNomeEmpresa());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getContato());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public List<Fornecedor> listar() {

        List<Fornecedor> lista = new ArrayList<>();

        String sql = "SELECT * FROM fornecedor";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Fornecedor f = new Fornecedor();

                f.setId(rs.getInt("id"));
                f.setNomeEmpresa(rs.getString("nome_empresa"));
                f.setCnpj(rs.getString("cnpj"));
                f.setContato(rs.getString("contato"));

                lista.add(f);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    
}
