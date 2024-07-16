/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author Usuario
 */
public class Ponto {
    
    double x;
    double y;
    
    double calcularDistanciaEuclidiana(Ponto ponto2){
        double deltaX = Math.pow((x-ponto2.x),2 );
        double deltaY = Math.pow((y-ponto2.y),2 );
        
        double soma = deltaX + deltaY;
        return Math.sqrt(soma);
    }
    
}
