/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Gerente extends Usuario {

    public Gerente() {}

    public Gerente(int id, String nome, String login, String senha) {
        super(id, nome, login, senha);
    }

    public void aprovarVenda() {
        System.out.println("Gerente aprovou a venda.");
    }
}
