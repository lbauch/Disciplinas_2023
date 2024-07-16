/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App16 {
    
    public static Ponto lerPonto(Scanner teclado){
        
        String entrada;
        
        Ponto ponto = new Ponto();
        
        System.out.println("Digite x e y do ponto, nesta ordem:");
        
        entrada = teclado.nextLine();
        ponto.x = Double.parseDouble(entrada);
        
        entrada = teclado.nextLine();
        ponto.y = Double.parseDouble(entrada);
        
        return ponto;
    }
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Ponto ponto1 = lerPonto(teclado);
        Ponto ponto2 = lerPonto(teclado);
        
        System.out.println("Distância entre os pontos: " +
            ponto1.calcularDistanciaEuclidiana(ponto2));
        
        System.out.println("prova real: " + 
            ponto2.calcularDistanciaEuclidiana(ponto1));
        
        teclado.close();
        
    }
}
