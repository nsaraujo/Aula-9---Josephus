/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import java.util.Random;

import java.util.Scanner;
/**
 *
 * @author 55649
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Random gerador = new Random();
        Roda roda = new Roda();



        while(true){
            int auxi = 20;
            System.out.println("-------------------------------------------");
            System.out.println("------------PROBLEMA DE JOSEPHUS-----------");
            System.out.println("-------------------------------------------");

            System.out.println("Registrando 20 pessoas");
            
            for (int pessoas = 0; pessoas < 20; pessoas++) {
                roda.inserirIndice(pessoas, pessoas + 1 + "", pessoas + 1 + "", pessoas + 1 + "", pessoas + 1 + "");
                
            }
            
            System.out.println("Deseja eliminar 19 pessoas aleatoriamente e descobrir quem é o vencedor? | (1 - Sim | 2 - Não");
            int opt = scan.nextInt ();
            if (opt == 1) {
                int aleatorio = gerador.nextInt (auxi);
                for (int x = 0; x < 19; x++) {
                roda.retirarIndice(aleatorio);
                auxi--;
                if(auxi == 0) break;
                aleatorio = gerador.nextInt (auxi);
            }

                System.out.println("O SOBREVIVENTE É: ");
                roda.listarTodas();
                
                roda.retirarInicio();   
            
        } else if (opt == 2) {
            System.out.println("Desligando...");
            break;
            } else{
            
        
            System.out.println("Opção inválida!!!");
            }
        
        }
    }
}

