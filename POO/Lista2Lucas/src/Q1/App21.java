/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App21 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String entrada;
        
        double peso, altura;
        String nome;
        
        Pessoa21 pessoas[] = new Pessoa21[3];
        
        for(int i=0; i<= pessoas.length-1; i++){
            
            System.out.println("Digite, nesta ordem: nome, altura e peso "+
                "da pessoa " + i);
            
            entrada = teclado.nextLine();
            nome = entrada;
            
            entrada = teclado.nextLine();
            altura = Double.parseDouble(entrada);
            
            entrada = teclado.nextLine();
            peso = Double.parseDouble(entrada);
            
            Pessoa21 pessoa = new Pessoa21(nome,altura,peso);
            
            pessoas[i] = pessoa;
        }       
        
        for (int i = pessoas.length - 1; i >= 0; i--) {
            System.out.println("O IMC de " + pessoas[i].getNome()
                    + " é: " + pessoas[i].calcularImc());
        }
        
        
        teclado.close();
        
    }
    
}
