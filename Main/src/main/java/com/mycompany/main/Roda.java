/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author 55649
 */
public class Roda {
    Pessoa inicio = null;
    int tamanho = 0;
    
    
    public void inserirInicio(String nome, String cpf, String endereco, String telefone) {
        
       Pessoa pessoa = new Pessoa();
       
       pessoa.nome = nome;
       pessoa.cpf = cpf;
       pessoa.endereco = endereco;
       pessoa.telefone = telefone;
       pessoa.proximo = inicio;
       
       inicio = pessoa;
       tamanho++; 
    }
    
    public Pessoa retirarInicio() {
        if (inicio == null) {
            return null;
        }

        Pessoa auxiliar = inicio;

        inicio = inicio.proximo;

        tamanho--;

        return auxiliar;
    }
    
    public void inserirFim(String nome, String cpf, String endereco, String telefone) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = nome;
        pessoa.cpf = cpf;
        pessoa.endereco = endereco;
        pessoa.telefone = telefone;
        
        if(inicio == null){
            pessoa. proximo = null;
            inicio = pessoa;
        }else {
            Pessoa local = inicio;
            
            while(local.proximo!=null){
            local = local.proximo;
            
            }
            
            local.proximo = pessoa;
            pessoa.proximo = null;
        }
        
        tamanho++;
    }
    
    public Pessoa retirarFim () {
        if(inicio == null) {
            return null;
        }
        Pessoa local = inicio;
        
        while(local.proximo!= null){
            Pessoa aux = local;
            local = local.proximo;
            
            if (local.proximo == null ) {
                aux.proximo = null;
                tamanho--;
                return local;
            
            }
        }

        inicio = null;
        tamanho--;
        return local;
    }

    public void inserirIndice (int index, String nome, String cpf, String endereco, String telefone) {
        if(index <= 0) {
            inserirInicio(nome, cpf, endereco, telefone);
            
        } else if (index >= tamanho) {
            inserirFim(nome, cpf, endereco, telefone);
        } else {
            Pessoa local = inicio;
            
            for (int i = 0; i < index; i++) {
                local = local.proximo;
        }

        Pessoa pessoa = new Pessoa();
        
        pessoa.nome=nome;
        pessoa.cpf = cpf;
        pessoa. endereco = endereco;
        pessoa.telefone = telefone;
        
        pessoa.proximo = local.proximo;
        local.proximo = pessoa;
        
        }
    }
    
    public Pessoa retirarIndice(int index) {
       if (index < 0
       || index >= tamanho
       || inicio == null){
           return null;
           
       } else if(index == 0){
           return retirarInicio();
           
       } else if (index == tamanho - 1) {
           return retirarFim();
       }

       Pessoa local = inicio;

       for( int i = 0; i < index - 1; i++) {
          local = local.proximo; 
       }


       Pessoa aux = local.proximo; 
       local.proximo = local.proximo.proximo;
       tamanho--;
       
       return aux;
    
    }
    
    public void listarTodas() {
        Pessoa auxiliar = inicio;
        int n = 0;
        if(auxiliar.proximo!=null){
            while(auxiliar.proximo!=null){
                n++;
                System.out.println("\n--------------------------------");
                System.out.println("\n" + n + "PESSOA DE NÚMERO: ");
                System.out.println(auxiliar.toString());
                System.out.println("\n--------------------------------");

                auxiliar = auxiliar.proximo;
            }
            n++;
            System.out.println("\n" + "PESSOA DE NÚMERO: ");
            System.out.println(auxiliar.toString());
        }else{
            n++;
            System.out.println("\n" + "PESSOA DE NÚMERO: ");
            System.out.println(auxiliar.toString());
    }
    
    n = 0;
    }
}