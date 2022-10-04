/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recuperacao;

import java.util.Scanner;

/**
 *
 * @author Alexia
 */
public class CODIGOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escreva um programa em Java que leia 2 valores e imprima o resultado 
        //da divisão do primeiro valor lido pelo segundo valor lido.
        // O programa deve ser finalizado quando o usuário digitar 0 (zero) para o segundo valor.
        Scanner ler = new Scanner(System.in);
        System.out.println ("Olá usuário");
        Scanner usuario = ler;
        double num1 = 0;
        double num2 = 0;
        double divisao = 0;
        int cont = 0;
        String segundo = null;
        do{
            System.out.println("Digite o primeiro número");
            num1 = ler.nextInt(); // usuario digita um número
            System.out.println("Digite o segundo número");
            
            num2 = ler.nextInt();
            if(num1 >= 1){ 
                 divisao = num1 / num2; 
                cont++; 
            
            } 
            System.out.println("Resultado da divisão dos números digitados: " + divisao); 
            
        } while(num2 > 0); 
        
       
      
        
        
        
      
         
    }

    private static void Next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
