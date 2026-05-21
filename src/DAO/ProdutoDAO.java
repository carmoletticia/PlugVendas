package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    public void salvar(Produto produto) {

        String sql = "INSERT INTO produto (nome, preco, quantidade, fornecedor) VALUES (?, ?, ?, ?)";

        try (
                 Connection conn = ConnectionFactory.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setString(4, produto.getFornecedor());

            stmt.execute();

            System.out.println("Produto salvo com sucesso");
        } catch (Exception e) {

            System.out.println("Erro ao salvar produto: " + e.getMessage());
        }
    }

    public void atualizar(Produto produto) {

        String sql = "UPDATE produto SET nome = ?, preco = ?, quantidade = ?, fornecedor = ? WHERE id = ?";

        try (
                 Connection conn = ConnectionFactory.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setString(4, produto.getFornecedor());
            stmt.setInt(5, produto.getId());

            stmt.executeUpdate();

            System.out.println("Produto atualizado com sucesso");

        } catch (Exception e) {

            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    public List<Produto> listar() {

        List<Produto> lista = new ArrayList<>();

        String sql = "SELECT * FROM produto";

        try (
                 Connection conn = ConnectionFactory.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql);  ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setFornecedor(rs.getString("fornecedor"));

                lista.add(produto);
            }
        } catch (Exception e) {

            System.out.println("Erro ao listar produtos: " + e.getMessage());
        }
        return lista;
    }

    public Produto buscarPorId(int id) {

        String sql = "SELECT * FROM produto WHERE id = ?";

        Produto produto = null;

        try (
                 Connection conn = ConnectionFactory.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setFornecedor(rs.getString("fornecedor"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return produto;
    }
}
