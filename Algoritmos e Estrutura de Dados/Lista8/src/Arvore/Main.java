package Arvore;

public class Main {
    
    public static void main(String[] args) {
        
        Arvore<Integer> a = new Arvore<>();
        NoArvore<Integer> n1 = new NoArvore<>(1);
        NoArvore<Integer> n2 = new NoArvore<>(2);
        NoArvore<Integer> n3 = new NoArvore<>(3);
        NoArvore<Integer> n4 = new NoArvore<>(4);
        NoArvore<Integer> n5 = new NoArvore<>(5);
        NoArvore<Integer> n6 = new NoArvore<>(6);
        NoArvore<Integer> n7 = new NoArvore<>(7);
        NoArvore<Integer> n8 = new NoArvore<>(8);
        NoArvore<Integer> n9 = new NoArvore<>(9);
        NoArvore<Integer> n10 = new NoArvore<>(10);
        NoArvore<Integer> n11 = new NoArvore<>(11);
        NoArvore<Integer> n12 = new NoArvore<>(12);
        
        n1.setPrimeiro(n2);
        n2.setProximo(n3);
        n2.setPrimeiro(n5);
        n3.setProximo(n4);
        n4.setPrimeiro(n11);
        n5.setPrimeiro(n6);
        n6.setProximo(n7);
        n7.setPrimeiro(n10);
        n7.setProximo(n8);
        n8.setProximo(n9);
        n9.setPrimeiro(n12);
        a.setRaiz(n1);
        
        System.out.println(a.contarNos());
        a.contarNos();
        
    }
    
}
