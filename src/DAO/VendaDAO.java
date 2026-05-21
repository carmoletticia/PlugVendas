
package DAO;

import Model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

public class VendaDAO {

    public void salvar(Venda venda) {

        String sql = "INSERT INTO venda (nome_cliente, valor_total, comissao, data_venda) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, venda.getNomeCliente());
            stmt.setDouble(2, venda.getValorTotal());
            stmt.setDouble(3, venda.getComissao());
            stmt.setDate(4, new Date(venda.getDataVenda().getTime()));

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
