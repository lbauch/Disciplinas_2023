/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author Usuario
 */
public class Retangulo {
    
    private double altura, lado;
    
    public Retangulo(double altura, double lado){
        setAltura(altura);
        setLado(lado);
    }
    
    public void setAltura(double altura){        
        if (altura<=0){
            throw new IllegalArgumentException("Altura deve ser positiva");
        }
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setLado(double lado){
        if (lado<=0){
            throw new IllegalArgumentException("Lado deve ser positivo");
        }
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public double calcularArea(){
        return getLado()*getAltura();
    }
    
    public double calcularPerimetro(){
        return 2*(getLado()+getAltura());
    }
    
}
