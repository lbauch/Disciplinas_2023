/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author Usuario
 */
public class App11 {
    
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();
    
        retangulo.lado = 3;
        retangulo.altura = 4;
        
        System.out.println("Área: " + retangulo.calcularArea()
        + "\nPerímetro: " + retangulo.calcularPerimetro());

        
    }
        
}
