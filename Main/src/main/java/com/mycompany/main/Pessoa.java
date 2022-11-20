/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author 55649
 */
public class Pessoa {
    String nome;
    String telefone;
    String endereco;
    String cpf;
    
    Pessoa proximo;
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nEndereço: " + this.endereco + "\nTelefone: " + this.telefone;
        
    }
}
