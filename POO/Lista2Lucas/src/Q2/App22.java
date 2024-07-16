/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App22 {
    
    public static Retangulo lerRetangulo(Scanner teclado){
        
        double lado, altura;
        String entrada;
        
        System.out.println("Digite o lado e a altura, nesta ordem:");
        entrada = teclado.nextLine();
        lado = Double.parseDouble(entrada);
        entrada = teclado.nextLine();
        altura = Double.parseDouble(entrada);
        
        Retangulo retangulo = new Retangulo(lado, altura);
        
        return retangulo;
    }
    
    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        String entrada;
        
        Retangulo retangs[] = new Retangulo[3];
        
        for(int i=0; i<=retangs.length-1; i++){
            
            Retangulo retang = lerRetangulo(teclado);
            
            System.out.println("Área: " + retang.calcularArea() + "\nPerímetro: " + retang.calcularPerimetro());
        }
        
        teclado.close();
    }
    
}
