/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App15 {
    
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    String entrada;
    
    Pessoa15 pessoas[] = new Pessoa15[3];
    
    for(int i=0; i<= pessoas.length-1; i++){
        
        Pessoa15 pessoa = new Pessoa15();
        
        System.out.println("Digite, nesta ordem: Nome, altura e peso da" 
        +" pessoa " + i );
        
        entrada = teclado.nextLine();
        pessoa.nome = entrada;
        
        entrada = teclado.nextLine();
        pessoa.altura = Double.parseDouble(entrada);
        
        entrada = teclado.nextLine();
        pessoa.peso = Double.parseDouble(entrada);
        
        pessoas[i] = pessoa;
    }
    
    for(int i=pessoas.length-1; i>=0; i--){
        
        System.out.println(pessoas[i].nome + ", IMC: " + 
            pessoas[i].calcularImc() + "\n=================================");
    }
        
    teclado.close();
    
    }
    
}
