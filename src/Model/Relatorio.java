package Model;

public class Relatorio {

    public void gerarRelatorioVenda(Venda venda) {

        System.out.println("=== RELATÓRIO ===");
        System.out.println("Cliente: " + venda.getNomeCliente());
        System.out.println("ID Produto: " + venda.getNomeProduto());
        System.out.println("Quantidade: " + venda.getQuantidade());
        System.out.println("Total: R$ " + venda.getValorTotal());
    }
}