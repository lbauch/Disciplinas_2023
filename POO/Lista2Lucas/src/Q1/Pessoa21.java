/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author Usuario
 */
public class Pessoa21 {
    
    private double altura, peso;
    private String nome;
    
    public Pessoa21(String nome, double altura, double peso){
        
        setNome(nome);
        setPeso(peso);
        setAltura(altura);
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double calcularImc(){
        return peso/(altura*altura);
    }
}
