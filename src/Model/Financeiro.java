/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Financeiro extends Usuario {

    public Financeiro() {}

    public Financeiro(int id, String nome, String login, String senha) {
        super(id, nome, login, senha);
    }

    public void gerarRelatorio() {
        System.out.println("Relatório financeiro gerado.");
    }
}