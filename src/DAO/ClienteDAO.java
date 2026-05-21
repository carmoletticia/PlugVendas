package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public int salvar(Cliente cliente) {

    String sql = "INSERT INTO cliente (nomeCliente, cpf, email) VALUES (?, ?, ?)";

    try (
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)
    ) {

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCpf());
        stmt.setString(3, cliente.getEmail());

        stmt.executeUpdate();

        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {

            int idGerado = rs.getInt(1);

            System.out.println("Cliente salvo com sucesso");

            return idGerado;
        }

    } catch (Exception e) {

        System.out.println("Erro ao salvar cliente: " + e.getMessage());
    }

    return 0;
}

    public List<Cliente> listar() {

    List<Cliente> lista = new ArrayList<>();

    String sql = "SELECT * FROM cliente";

    try (
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()
    ) {

        while (rs.next()) {

            Cliente cliente = new Cliente();

            cliente.setId(rs.getInt("idCliente"));
            cliente.setNome(rs.getString("nomeCliente"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setEmail(rs.getString("email"));

            lista.add(cliente);
        }

    } catch (Exception e) {
        System.out.println("Erro ao listar clientes: " + e.getMessage());
    }

    return lista;
}
    
}
