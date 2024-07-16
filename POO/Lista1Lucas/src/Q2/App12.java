/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author Usuario
 */
public class App12 {
    
    public static void main(String[] args) {
        
        Pessoa12 pessoa = new Pessoa12();
        
        pessoa.altura = 1.75;
        pessoa.peso = 78;
        
        System.out.println("Imc: " + pessoa.calcularImc());
    }
    
}
