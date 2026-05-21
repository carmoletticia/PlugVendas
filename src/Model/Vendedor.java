/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Vendedor extends Usuario {

    public Vendedor() {}

    public Vendedor(int id, String nome, String login, String senha) {
        super(id, nome, login, senha);
    }

    public void registrarVenda() {
        System.out.println("Venda registrada pelo vendedor.");
    }
}
