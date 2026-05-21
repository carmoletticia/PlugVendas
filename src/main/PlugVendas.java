package main;

import Model.Cliente;
import Model.Fornecedor;
import Model.Produto;
import Model.Relatorio;
import Model.Venda;
import Model.*;

public class PlugVendas {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Maria Silva");

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNomeEmpresa("Fornecedor Global");

        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Notebook Gamer");
        produto.setPreco(4200.00);
        produto.setFornecedor(fornecedor);

        Venda venda = new Venda();
        venda.setId(1);
        venda.setNomeCliente(produto.getNome());
        venda.setNomeProduto(produto.getNome());
        venda.setQuantidade(2);

        System.out.println("=== SISTEMA PLUGVENDAS ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Total da venda: R$ " + venda.calcularTotal(produto.getPreco()));

        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorioVenda(venda);

    }

}
