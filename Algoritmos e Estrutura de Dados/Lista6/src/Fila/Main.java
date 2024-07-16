package Fila;

public class Main {
    
    public static void main(String[] args) {
        
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        System.out.println(fila.toString());
        
        FilaVetor<Integer> fila2 = new FilaVetor<>(3);
        fila2.inserir(40);
        fila2.inserir(50);
        System.out.println(fila2.toString());
        
        FilaVetor<Integer> fila3 = fila.criarFilaConcatenada(fila2);
        System.out.println(fila3.toString());
        System.out.println(fila3.getLimite());
    }
    
}
